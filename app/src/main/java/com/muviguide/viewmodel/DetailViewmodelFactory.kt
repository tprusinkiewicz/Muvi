package com.muviguide.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.muviguide.api.TmdbRepo

class DetailViewmodelFactory(val repo: TmdbRepo, val movieId: Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DetailViewmodel(repo, movieId) as T
    }
}