package com.mumscheddemo.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumscheddemo.dao.EntryDao;
import com.mumscheddemo.domain.Entry;
import com.mumscheddemo.service.EntryService;

@Service
public class EntryServiceImp implements EntryService {

	@Autowired
	EntryDao entryDAO;

	public void save(Entry entry) {
		entryDAO.save(entry);
		return;
	}

	@Override
	public Entry getEntryByEntryName(String entryname) {
		return entryDAO.findEntryByEntryName(entryname);
	}

	@Override
	public Entry getEntryByEntryID(int entryID) {
		return entryDAO.findEntryByEntryID(entryID);
	}

	@Override
	public List<Entry> getAllEntry() {
		// TODO Auto-generated method stub
		return entryDAO.getAllEntry();
	}

}
