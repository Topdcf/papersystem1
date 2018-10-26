package com.pojo

class Paper {
    var paperId: Long = 0
    var paperName: String? = null
    var paperNum: Int = 0
    var paperDetail: String? = null

    constructor(paperId: Long, paperName: String, paperNum: Int, paperDetail: String) {
        this.paperId = paperId
        this.paperName = paperName
        this.paperNum = paperNum
        this.paperDetail = paperDetail
    }

    constructor() : super() {}
}
