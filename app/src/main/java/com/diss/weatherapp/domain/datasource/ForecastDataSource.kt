package com.diss.weatherapp.domain.datasource

import com.diss.weatherapp.domain.model.Forecast
import com.diss.weatherapp.domain.model.ForecastList

interface ForecastDataSource {

    fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList?

    fun requestDayForecast(id: Long): Forecast?

}