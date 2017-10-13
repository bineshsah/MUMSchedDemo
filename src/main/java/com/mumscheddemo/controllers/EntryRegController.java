package com.mumscheddemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mumscheddemo.domain.Entry;
import com.mumscheddemo.service.EntryService;

@Controller
public class EntryRegController {

	@Autowired
	EntryService entryService;

	@RequestMapping(value = "/entry", method = RequestMethod.GET)
	public String entryRegForm(@ModelAttribute("newEntry") Entry entry, Model model) {
		List<Entry> entryList = new ArrayList<Entry>();
		entryList.addAll(entryService.getAllEntry());
		System.out.println(entryList);
		model.addAttribute("entryList", entryList);
		model.addAttribute("newEntry", entry);
		return "addEntryForm";
	}

	@RequestMapping(value = { "/addnewentry" }, method = RequestMethod.POST)
	public String registerNewEntry(@ModelAttribute("newEntry") Entry entry, Model model) {
		entryService.save(entry);
		return "redirect:/entry";
	}

}
