package com.priyo.composepreviewsample

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.priyo.composepreviewsample.ui.theme.ComposePreviewSampleTheme

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
	ComposePreviewSampleTheme {
		Greeting(sampleData.name)
	}
}

val sampleData = User(1, "Priyabrata")