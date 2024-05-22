package com.example.mrtjonline.data

import com.example.mrtjonline.model.Category
import com.example.mrtjonline.model.SubCategory

class DataSource {

    fun loadArticle(): List<SubCategory> {
    return listOf(
        SubCategory("Gitarre, Yamaha",2,200.00, Category("Gitarre"),)
    )
    }

}