package com.example.marsphotos.fake.data

import com.example.marsphotos.data.MarsPhotosRepository
import com.example.marsphotos.fake.model.FakeDataSource
import com.example.marsphotos.model.MarsPhoto

class FakeNetworkMarsPhotosRepository: MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}