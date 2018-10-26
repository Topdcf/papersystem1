package com.service.impl

import com.dao.PaperDao
import com.pojo.Paper
import com.service.PaperService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PaperServiceImpl : PaperService {
    @Autowired
    private val paperDao: PaperDao? = null

    override fun addPaper(paper: Paper): Int {
        return paperDao!!.addPaper(paper)
    }

    override fun deletePaperById(id: Long): Int {
        return paperDao!!.deletePaperById(id)
    }

    override fun updatePaper(paper: Paper): Int {
        return paperDao!!.updatePaper(paper)
    }

    override fun queryById(id: Long): Paper {
        return paperDao!!.queryById(id)
    }

    override fun queryAllPaper(): List<Paper> {
        return paperDao!!.queryAllPaper()
    }
}
