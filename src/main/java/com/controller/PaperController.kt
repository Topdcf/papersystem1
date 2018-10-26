package com.controller

import com.pojo.Paper
import com.service.PaperService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.transaction.annotation.Transactional
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/paper")
class PaperController {
    @Autowired
    private val paperService: PaperService? = null

    @RequestMapping("/allPaper")
    fun list(model: Model): String {
        val list = paperService!!.queryAllPaper()
        model.addAttribute("list", list)
        return "allPaper"
    }

    @Transactional
    @RequestMapping("toAddPaper")
    fun toAddPaper(): String {
        return "addPage"
    }

    @RequestMapping("/addPaper")
    fun addPaper(paper: Paper): String {
        paperService!!.addPaper(paper)
        return "redirect:/paper/allPaper"
    }

    @RequestMapping("/del/{paperId}")
    fun deletePaper(@PathVariable("paperId") id: Long): String {
        paperService!!.deletePaperById(id)
        return "redirect:/paper/allPaper"
    }

    @RequestMapping("toUpdatePaper")
    fun toUpdatePaper(model: Model, id: Long): String {
        model.addAttribute("paper", paperService!!.queryById(id))
        return "updatePaper"
    }

    @RequestMapping("/updatePaper")
    fun updatePaper(model: Model, paper: Paper): String {
        var paper = paper
        paperService!!.updatePaper(paper)
        paper = paperService.queryById(paper.paperId)
        model.addAttribute("paper", paper)
        return "redirecta;/paper/allPaper"
    }
}
