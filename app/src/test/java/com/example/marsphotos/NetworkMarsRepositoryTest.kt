package com.example.marsphotos

import com.example.marsphotos.data.NetworkMarsPhotoRepository
import com.example.marsphotos.fake.model.FakeDataSource
import com.example.marsphotos.fake.network.FakeMarsApiService
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test

class NetworkMarsRepositoryTest {
    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() =
        runTest{
        val repository = NetworkMarsPhotoRepository(
            marsApiService = FakeMarsApiService()
        )
        assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
    }
}