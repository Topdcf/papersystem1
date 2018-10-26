package com.dao

import com.pojo.Paper

interface PaperDao {
    fun addPaper(paper: Paper): Int

    fun deletePaperById(id: Long): Int

    fun updatePaper(paper: Paper): Int

    fun queryById(id: Long): Paper

    fun queryAllPaper(): List<Paper>
}
