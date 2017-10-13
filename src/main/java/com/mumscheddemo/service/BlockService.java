package com.mumscheddemo.service;

import java.util.List;

import com.mumscheddemo.domain.Block;

public interface BlockService {

	public void save(Block block);

	public Block getBlockByBlockID(int blockid);

	public Block getBlockByBlockName(String blockName);

	public List<Block> getAllBlock();

}
