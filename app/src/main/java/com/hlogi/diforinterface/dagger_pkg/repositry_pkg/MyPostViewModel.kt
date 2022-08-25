package com.hlogi.diforinterface.dagger_pkg.repositry_pkg

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.hlogi.diforinterface.dagger_pkg.Post
import dagger.hilt.android.lifecycle.HiltViewModel

import kotlinx.coroutines.flow.catch
import javax.inject.Inject

/**
 * Created by Sonam on 25-08-2022 12:04.
 */
/**Post Repositry dependency provide
 * @Inject not use for external libarray dependency
 * postViewModel are external libaray bcause its extend by ViewModel
 *@HiltViewModel for ViewModel
 * catch for get data exception handle
 *
 * asLiveData() convert reponce data Flow to LIVEDATA

 * */
@HiltViewModel //External dependency
class MyPostViewModel @Inject constructor(
    private val postRepositry:
    PostRepositry
) : ViewModel() {
    val responce: LiveData<List<Post>> = postRepositry.getPost().catch { emit ->
        Log.e("Main", "${emit.message}")
    }.asLiveData()
}