package com.service

import com.pojo.Paper

interface PaperService {
    fun addPaper(paper: Paper): Int //增

    fun deletePaperById(id: Long): Int //删

    fun updatePaper(paper: Paper): Int //改

    fun queryById(id: Long): Paper //查一个

    fun queryAllPaper(): List<Paper> //查全部
}
