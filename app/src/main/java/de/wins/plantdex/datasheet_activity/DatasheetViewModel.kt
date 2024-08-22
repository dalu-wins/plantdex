package de.wins.plantdex.datasheet_activity

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import de.wins.plantdex.core.Plant
import de.wins.plantdex.core.PlantRepository
import javax.inject.Inject

@HiltViewModel
class DatasheetViewModel @Inject constructor(val plantRepository: PlantRepository) : ViewModel() {

    fun getPlant(index: Int) : Plant {
        return plantRepository.plants.value[index]
    }

}