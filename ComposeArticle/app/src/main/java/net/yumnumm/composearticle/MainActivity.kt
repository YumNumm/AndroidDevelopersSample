package net.yumnumm.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.yumnumm.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ComposeArticleTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
          ComposeArticle()
        }
      }
    }
  }
}

@Composable
fun ComposeArticle() {
  Column {
    HeaderImage()
    ArticleBody()
  }
}

@Composable
fun HeaderImage() {
  val image = painterResource(id = R.drawable.bg_compose_background)
  Image(
    painter = image,
    contentDescription = null,
    modifier = Modifier
      .fillMaxWidth()
  )
}

@Composable
fun ArticleBody() {
  Column {
    Text(
      text = stringResource(R.string.article_title),
      fontSize = 24.sp,
      modifier = Modifier.padding(16.dp),
      fontWeight = FontWeight.Bold,
    )
    Text(
      text = stringResource(R.string.article_body_1),
      modifier = Modifier.padding(horizontal = 16.dp),
      textAlign = TextAlign.Justify
    )
    Text(
      text = stringResource(R.string.article_body_2),
      modifier = Modifier.padding(16.dp),
      textAlign = TextAlign.Justify
    )
  }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  ComposeArticleTheme {
    ComposeArticle()
  }
}
