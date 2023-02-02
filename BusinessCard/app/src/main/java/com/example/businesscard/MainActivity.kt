package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color(0xFF201324)
            ) {
                BusinessCardTheme {
                    UserFCs(stringResource(R.string.luna_lable), stringResource(R.string.slogan))
                    Contacts(stringResource(R.string.phone_number), stringResource(R.string.social), stringResource(R.string.mail))
                }
            }
        }
    }
}

@Composable
fun UserFCs(naming: String, description: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .padding(bottom = 48.dp)
                .scale(1.2f)
        )
        Text(
            text = naming,
            color = Color(0xFFF4F9FB),
            fontSize = 36.sp
        )
        Text(
            text = description,
            color = Color(0xFFCEA4B6)
        )
    }
}

@Composable
fun Contacts(phoneNumber: String, social: String, mail: String) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .padding(start = 36.dp, end = 36.dp, top = 36.dp, bottom = 36.dp)
    ) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.vk),
                contentDescription = null
            )
            Text(
                text = phoneNumber,
                color = Color(0xFFF9F4FB),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .wrapContentWidth(Alignment.End)
            )
        }

        Divider(
            color = Color(0xFF855E92),
            thickness = 1.dp,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 10.dp)
        )

        Row {
            Image(
                painter = painterResource(id = R.drawable.telegram),
                contentDescription = null
            )
            Text(
                text = social,
                color = Color(0xFFF9F4FB),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .wrapContentWidth(Alignment.End)
            )
        }

        Divider(
            color = Color(0xFF855E92),
            thickness = 1.dp,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 10.dp)
        )

        Row {
            Image(
                painter = painterResource(id = R.drawable.open_envelope),
                contentDescription = null
            )
            Text(
                text = mail,
                color = Color(0xFFF9F4FB),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .wrapContentWidth(Alignment.End)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF201324)
    ) {
        BusinessCardTheme {
            UserFCs(stringResource(R.string.luna_lable), stringResource(R.string.slogan))
            Contacts(stringResource(R.string.phone_number), stringResource(R.string.social), stringResource(R.string.mail))
        }
    }
}