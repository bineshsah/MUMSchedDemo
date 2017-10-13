package com.mumscheddemo.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumscheddemo.dao.BlockDao;
import com.mumscheddemo.domain.Block;
import com.mumscheddemo.service.BlockService;

@Service
public class BlockServiceImp implements BlockService {

	@Autowired
	BlockDao blockDAO;

	public void save(Block block) {
		blockDAO.save(block);
		return;
	}

	@Override
	public Block getBlockByBlockName(String blockname) {
		return blockDAO.findBlockByBlockName(blockname);
	}

	@Override
	public Block getBlockByBlockID(int blockID) {
		return blockDAO.findBlockByBlockID(blockID);
	}

	@Override
	public List<Block> getAllBlock() {
		// TODO Auto-generated method stub
		return blockDAO.getAllBlock();
	}

}
