package com.cjc.main.bank.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.bank.model.Account;
import com.cjc.main.bank.model.Transactions;
import com.cjc.main.bank.service.HomeService;


@Controller
public class HomeController {

	@PostMapping("/addAccount")
	public String addUser(@RequestBody() Account a)
	{
		System.out.println(",,,,,,,");
		hs.saveAccount(a);
		return "data added";
	}
	@GetMapping("/getAccount")
	public List getAccount()
	{
		List list=hs.findAll();
		return list;
	}
	
	@PutMapping("/updateaccount/{accno}")
	public String updateAccount(@PathVariable("accno")int accno,@RequestBody Account a)
	{
		Account a1=hs.findByAccno(accno);
		a1.setName(a.getName());
		hs.saveAccount(a1);
		return "update";
	}
	
	
	@Autowired
	HomeService hs;
	
	private Transactions tr=null;
	
	@GetMapping("/get")
	public String getData()
	{
		return "welcome to cjc";
	}
	
	
	@RequestMapping("/")
	public String logg() {
		return "login2";
	}

	@RequestMapping("/reg")
	public String reggg() {
		return "register";
	}

	@RequestMapping("/registertologin")
	public String backToLogin(@ModelAttribute Account a) {
		
		hs.saveAccount(a);

		return "login2";
	}	

	@RequestMapping("/successtologin")
	public String successToLogin() {
		
		return "login2";
	}	

	@RequestMapping("/login")
	public String result( @RequestParam("username") String un, @RequestParam("password") String ps ,Model m)
	{
																																																																																																																																																																																																																																																																																Account account=hs.findByUsernameAndPassword(un, ps);
			Account a=hs.findByUsernameAndPassword(un, ps);
			
			if(un.equals(a.getUsername())&& ps.equals(a.getPassword()))
			{
				m.addAttribute("data",a);
				return "success1";
					
																																																																																																																																																																																																																																																																																
			}
			return "error";
	}
	
	@RequestMapping("/diposite")
	public String dipositeMoney(@RequestParam("accno") int accno,	Model m)
	{
		Account a=hs.findByAccno(accno);
		m.addAttribute("data",a);
		return "diposite";
	}
	
	@RequestMapping("/editaccount")
	public String editAccount(@RequestParam("accno")int accno,Model m)
	{
		Account a=hs.findByAccno(accno);
		m.addAttribute("data",a);
		return "update";
	}
	
	@RequestMapping("/updatetologin")
	public String updateToLogin(@ModelAttribute Account a,Model m)
	{
		hs.saveAccount(a);
		
		return "login2";
	}
	
	@RequestMapping("/withdraw")
	public  String withdrawMoney(@RequestParam("accno") int accno,	Model m)
	{
		Account a=hs.findByAccno(accno);
		m.addAttribute("data",a);
		return "withdrawl";
	}
	@RequestMapping("/withdrawltohome")
	
	public String withdrwlMoneyToHome(@RequestParam("balence")double b,@RequestParam("accno")int accno)
	{
		Account a=hs.findByAccno(accno);
		
		double bal=a.getBalence()-b;
		if(bal>=1000) {
			a.setBalence(bal);
			tr= new Transactions();
			tr.setTraAmt(b);
			tr.setType("withdraw");
			tr.setLdt(LocalDateTime.now());
			tr.setSenderName("NA");
			tr.setRecieverName("NA");
			tr.setSenderAcc(000000);
			tr.setRecieverAcc(000000);
			a.getLtra().add(tr);
	
			hs.saveAccount(a);
			
		
			
			return "login1";
		}
		else
		{
			return "error";
		}
		
	}

	@RequestMapping("/dipositetohome")
	public String dipositeMoneyToHome(@RequestParam("balence")double b,@RequestParam("accno")int accno)
		{
			Account a=hs.findByAccno(accno);
			double bal=a.getBalence()+b;
			a.setBalence(bal);
			tr=new Transactions();
			tr.setTraAmt(b);
			tr.setType("deposite");
			tr.setLdt(LocalDateTime.now());
			tr.setSenderName("NA");
			tr.setRecieverName("NA");
			tr.setSenderAcc(000000);
			tr.setRecieverAcc(000000);
			a.getLtra().add(tr);
			
			hs.saveAccount(a);
			
			return "login2";
		}

	@RequestMapping("/lasttransaction")
	public String lastTransaction(@RequestParam("accno") int accno, Model model) {
	  
  
		
		Account acn = hs.findByAccno(accno);
		
		model.addAttribute("data",acn.getLtra());
		model.addAttribute("acc",accno);
	model.addAttribute("name",acn.getName());
		return "transaction2";
	}

	@RequestMapping("/transferMoneytoother")
	public String transferMoneyToOther(@RequestParam("accno")int accno,Model m)
	{
		Account a=hs.findByAccno(accno);
		
		m.addAttribute("data",a);
		return "transfermoney";
	}
	
	@RequestMapping("/transfermoney")
	public String transferTohome(@RequestParam("accno")int accno,@RequestParam("rcvaccno")int accno1,@RequestParam("balence")double b,Model m)
	{
		Account a=hs.findByAccno(accno);
		double bal=a.getBalence()-b;
		a.setBalence(bal);
		tr=new Transactions();
		
		tr.setSenderAcc(accno);
		tr.setRecieverAcc(accno1);
		tr.setTraAmt(b);
		tr.setLdt(LocalDateTime.now());
		tr.setType("withdraw");
		tr.setSenderName(a.getName());
		
		
		
		
		Account a1=hs.findByAccno(accno1);
		double bal1=a1.getBalence()+b;
		Transactions tr1 = new Transactions();
		a1.setBalence(bal1);
		tr1.setSenderAcc(accno);
		tr1.setRecieverAcc(accno1);
		tr1.setTraAmt(b);
		tr1.setLdt(LocalDateTime.now());
		tr1.setRecieverName(a1.getName());
		tr1.setType("diposite");
		
		tr.setRecieverName(a1.getName());
		tr1.setSenderName(a.getName());
		a.getLtra().add(tr);
		a1.getLtra().add(tr1);
		
		hs.saveAccount(a);
		hs.saveAccount(a1);
		
		
		return "login2";
	}
	

}
	
