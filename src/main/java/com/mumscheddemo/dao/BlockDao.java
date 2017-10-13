package com.mumscheddemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mumscheddemo.domain.Block;

@Repository
public interface BlockDao extends CrudRepository<Block, Long> {

	@Query("select s from Block s where s.blockID= :blockID")
	public Block findBlockByBlockID(@Param("blockID") int blockID);

	@Query("select s from Block s where s.blockName= :blockName")
	public Block findBlockByBlockName(@Param("blockName") String blockname);

	@Query("select s from Block s")
	public List<Block> getAllBlock();

}
