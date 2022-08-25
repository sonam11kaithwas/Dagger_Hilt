package com.hlogi.diforinterface.dagger_pkg.di_pkg

import com.hlogi.diforinterface.dagger_pkg.Post
import retrofit2.http.GET

/**
 * Created by Sonam on 25-08-2022 11:21.
 */
interface PostApiService {

    @GET("posts")
    suspend fun getPost():List<Post>
}