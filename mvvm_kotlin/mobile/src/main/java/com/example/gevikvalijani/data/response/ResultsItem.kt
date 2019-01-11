package com.example.gevikvalijani.data.response

data class ResultsItem(
	val cars: List<CarsItem?>? = null,
	val address: Address? = null,
	val provider: Provider? = null,
	val branchId: String? = null,
	val location: Location? = null,
	val airport: String? = null
)
