package sg.shadowchess.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val board: LiveData<Board> = MutableLiveData()
}

class Board {

}


