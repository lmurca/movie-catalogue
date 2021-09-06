package com.riyaldi.moviecatalogue.ui.home

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.IdlingRegistry
import com.riyaldi.moviecatalogue.utils.DataDummy
import com.riyaldi.moviecatalogue.utils.EspressoIdlingResource
import org.junit.After
import org.junit.Before

class HomeActivityTest {

    private val dummyMovie = DataDummy.getMovies()
    private val dummyTvShow = DataDummy.getTvShows()

    @Before
    fun setup() {
        ActivityScenario.launch(HomeActivity::class.java)
        IdlingRegistry.getInstance().register(EspressoIdlingResource.getEspressoIdlingResource())
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.getEspressoIdlingResource())
    }

    // TEST 1: Check recycler view is displayed, click on an elements then all details is displayed correctly

    // TEST 2: Click on tv show menu option, check if a list of tv shows is displayed

    // TEST 3: Click on tv show menu option, check if a list of tv shows is displayed, click on a tv show then display details of that tv show

    // TEST 4: Click on favorites menu option, check if a list of favorites is displayed

    // TEST 5: Click on movie, add it to favorites, press back, click on favorite menu option, check if that movie was added

    // TEST 6, 7, 8, 9... It's your turn! Try to identify new scenarios!
}