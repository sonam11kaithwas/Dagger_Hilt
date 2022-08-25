package com.hlogi.diforinterface.dagger_pkg.repositry_pkg

import com.hlogi.diforinterface.dagger_pkg.Post
import com.hlogi.diforinterface.dagger_pkg.di_pkg.PostApiServiceImple
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

/**
 * Created by Sonam on 25-08-2022 11:30.
 */
/**perform background task inside repostry class fetch data from server*******
 *  provied dependemcy of PostApiServiceImple by using @Inject
 * FLOW ->  all data from server handle Asynchronc & data EMIT In sequence order
 * by using flow block
 * Asynchronc means Take more time for process
 * Asynchronc task in backgroound by using flowOn
 *
 **/
 class PostRepositry @Inject constructor(private val postApiServiceImple: PostApiServiceImple) {
     fun getPost(): Flow<List<Post>> = flow {
        val responce = postApiServiceImple.getPost()
        emit(responce)//emit data in sequence order
    }.flowOn(Dispatchers.IO)// Asynchronc task in backgroound by using flowOn
}