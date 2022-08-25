package com.hlogi.diforinterface.dagger_pkg.di_pkg

import com.hlogi.diforinterface.dagger_pkg.Post
import javax.inject.Inject

/**
 * Created by Sonam on 25-08-2022 11:23.
 */

/***Implemt Post service interface provide defination***/
class PostApiServiceImple @Inject constructor(val postApiService: PostApiService){

suspend fun getPost():List<Post> =postApiService.getPost()
}