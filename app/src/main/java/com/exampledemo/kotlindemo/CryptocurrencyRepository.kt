package com.exampledemo.kotlindemo

interface CryptocurrencyRepository {
	fun getCryptoCurrency(): List<Cryptocurrency>
}
