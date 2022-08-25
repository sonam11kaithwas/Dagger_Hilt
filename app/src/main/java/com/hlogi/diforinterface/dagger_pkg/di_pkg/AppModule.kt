package com.hlogi.diforinterface.dagger_pkg.di_pkg

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Sonam on 24-08-2022 18:39.
 */
/*****valid for full Application*****/
@Module
@InstallIn(SingletonComponent::class)
class AppModule {

//    add dpendency for BASE url
    @Provides
    fun providesBaseUrl():String="https://jsonplaceholder.typicode.com/"

    //retrofit builder dependency provide
    @Provides
    @Singleton
    fun provideRetrofitBuilder(baseUri:String):Retrofit=Retrofit.Builder()
        .baseUrl(providesBaseUrl())
        .addConverterFactory(GsonConverterFactory.create())
        .build()//check dragger return type


//     post Api service dependency provide of PostApiService by using MyApp class(Container)
    @Provides
    fun providesPostAPiService(retrofit: Retrofit):PostApiService=retrofit.create(PostApiService::class.java)

}