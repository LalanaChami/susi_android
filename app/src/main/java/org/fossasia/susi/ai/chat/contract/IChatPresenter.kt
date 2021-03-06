package org.fossasia.susi.ai.chat.contract

import org.fossasia.susi.ai.rest.responses.susi.SusiResponse

/**
 * The interface for Chat Presenter
 *
 * Created by chiragw15 on 9/7/17.
 */
interface IChatPresenter {

    fun retrieveOldMessages(firstRun: Boolean)
    fun getUndeliveredMessages()
    fun setUp()

    // Preferences and permissions
    fun checkPreferences()

    fun check(boolean: Boolean)
    fun micCheck(boolean: Boolean)
    fun micCheck(): Boolean

    // Getting user location
    fun getLocationFromIP()

    fun getLocationFromLocationService()

    // Interaction with susi
    fun sendMessage(query: String, actual: String)

    fun addToNonDeliveredList(query: String, actual: String)
    fun startComputingThread()

    // Hotword Detection
    fun initiateHotwordDetection()

    fun stopHotwordDetection()
    fun startHotwordDetection()
    fun hotwordDetected()

    // STT and TTS
    fun startSpeechInput()

    fun disableMicInput(boolean: Boolean)

    // Detach
    fun onDetach()

    fun executeTask(planDelay: Long, susiResponse: SusiResponse, i: Int, date: String)

    fun removeCallBacks()

    fun playRingTone()
}
