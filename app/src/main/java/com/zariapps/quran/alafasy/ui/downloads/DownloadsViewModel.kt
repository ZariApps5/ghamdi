package com.zariapps.quran.alafasy.ui.downloads

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zariapps.quran.alafasy.data.model.SurahData
import com.zariapps.quran.alafasy.player.PlayerManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DownloadsViewModel @Inject constructor(
    private val playerManager: PlayerManager
) : ViewModel() {

    val surahs = SurahData.allSurahs

    fun playSurah(surahNumber: Int) {
        viewModelScope.launch {
            playerManager.play(surahNumber)
        }
    }
}
