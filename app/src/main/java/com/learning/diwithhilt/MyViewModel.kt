package com.learning.diwithhilt

import androidx.lifecycle.ViewModel
import com.learning.diwithhilt.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: MyRepository
): ViewModel() {

}