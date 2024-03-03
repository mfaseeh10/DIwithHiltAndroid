package com.learning.diwithhilt

import androidx.lifecycle.ViewModel
import com.learning.diwithhilt.domain.repository.MyRepository


class MyViewModel (
    private val repository: MyRepository
): ViewModel() {

}