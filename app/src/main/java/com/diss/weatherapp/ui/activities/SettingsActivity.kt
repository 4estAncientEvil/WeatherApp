package com.diss.weatherapp.ui.activities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.diss.weatherapp.R
import com.diss.weatherapp.extensions.DelegatesExt
import com.diss.weatherapp.ui.adapters.ForecastListAdapter
import kotlinx.android.synthetic.main.activity_settings.*
import kotlinx.android.synthetic.main.toolbar.*

class SettingsActivity : AppCompatActivity() {

    companion object {
        const val ZIP_LVIV = 702550L
        const val ZIP_MYKOLAIV = 700569L
        const val ZIP_CHERKASY = 710791L
        const val ZIP_CHERNIHIV = 710735L
        const val ZIP_CHERNIVTSI = 710719L
        const val ZIP_DNIEPRO = 709930L
        const val ZIP_DONETSK = 709717L
        const val ZIP_IVANO_FRANKIVSK = 707471L
        const val ZIP_KHERSON = 706448L
        const val ZIP_KHMELNYTSKYY = 706369L
        const val ZIP_KROPYVNYTSKYI = 705812L
        const val ZIP_KYIV = 703447L
        const val ZIP_LUHANSK = 702658L
        const val ZIP_LUTSK = 702569L
        const val ZIP_ODESSA = 698740L
        const val ZIP_POLTAVA = 696643L
        const val ZIP_RIVNE = 695365L
        const val ZIP_SIMFEROPOL = 693805L
        const val ZIP_SUMY = 692194L
        const val ZIP_TERNOPIL = 691650L
        const val ZIP_UZHHOROD = 690548L
        const val ZIP_VINNYTSYA = 689558L
        const val ZIP_ZAPORIZHZHYA = 687700L
        const val ZIP_ZHYTOMYR = 686967L

        const val ZIP_CODE = "zipCode"
        const val DEFAULT_ZIP = ZIP_LVIV
    }

    private var zipCode: Long by DelegatesExt.preference(this, ZIP_CODE, DEFAULT_ZIP)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        whichButton()
    }


    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        android.R.id.home -> {
            onBackPressed()
            true
        }
        else -> false
    }

    fun whichButton() {
        val btnLviv = findViewById<Button>(R.id.btnLviv)
        btnLviv.setOnClickListener {
            zipCode = ZIP_LVIV
            tvCity.text = "Ви обрали Львів"
        }
        val btnMykolaiv = findViewById<Button>(R.id.btnMykolaiv)
        btnMykolaiv.setOnClickListener {
            zipCode = ZIP_MYKOLAIV
            tvCity.text = "Ви обрали Миколаїв"
        }
        val btnCherkasy = findViewById<Button>(R.id.btnCherkasy)
        btnCherkasy.setOnClickListener {
            zipCode = ZIP_CHERKASY
            tvCity.text = "Ви обрали Черкаси"
        }
        val btnChernihiv = findViewById<Button>(R.id.btnChernihiv)
        btnChernihiv.setOnClickListener {
            zipCode = ZIP_CHERNIHIV
            tvCity.text = "Ви обрали Чернігів"
        }
        val btnChernivtsi = findViewById<Button>(R.id.btnChernivtsi)
        btnChernivtsi.setOnClickListener {
            zipCode = ZIP_CHERNIVTSI
            tvCity.text = "Ви обрали Чернівці"
        }
        val btnDniepro = findViewById<Button>(R.id.btnDniepro)
        btnDniepro.setOnClickListener {
            zipCode = ZIP_DNIEPRO
            tvCity.text = "Ви обрали Дніпро"
        }
        val btnDonetsk = findViewById<Button>(R.id.btnDonetsk)
        btnDonetsk.setOnClickListener {
            zipCode = ZIP_DONETSK
            tvCity.text = "Ви обрали Донецьк"
        }
        val btnI_F = findViewById<Button>(R.id.btnI_F)
        btnI_F.setOnClickListener {
            zipCode = ZIP_IVANO_FRANKIVSK
            tvCity.text = "Ви обрали Івано-Франківськ"
        }
        val btnKherson = findViewById<Button>(R.id.btnKherson)
        btnKherson.setOnClickListener {
            zipCode = ZIP_KHERSON
            tvCity.text = "Ви обрали Херсон"
        }
        val btnKhmelnytskyy = findViewById<Button>(R.id.btnKhmelnytskyy)
        btnKhmelnytskyy.setOnClickListener {
            zipCode = ZIP_KHMELNYTSKYY
            tvCity.text = "Ви обрали Хмельницький"
        }
        val btnKropyvnytskyi = findViewById<Button>(R.id.btnKropyvnytskyi)
        btnKropyvnytskyi.setOnClickListener {
            zipCode = ZIP_KROPYVNYTSKYI
            tvCity.text = "Ви обрали Кропивницький"
        }
        val btnKyiv = findViewById<Button>(R.id.btnKyiv)
        btnKyiv.setOnClickListener {
            zipCode = ZIP_KYIV
            tvCity.text = "Ви обрали Київ"
        }
        val btnLuhansk = findViewById<Button>(R.id.btnLuhansk)
        btnLuhansk.setOnClickListener {
            zipCode = ZIP_LUHANSK
            tvCity.text = "Ви обрали Луганськ"
        }
        val btnLutsk = findViewById<Button>(R.id.btnLutsk)
        btnLutsk.setOnClickListener {
            zipCode = ZIP_LUTSK
            tvCity.text = "Ви обрали Луцьк"
        }
        val btnOdessa = findViewById<Button>(R.id.btnOdessa)
        btnOdessa.setOnClickListener {
            zipCode = ZIP_ODESSA
            tvCity.text = "Ви обрали Одесса"
        }
        val btnPoltava = findViewById<Button>(R.id.btnPoltava)
        btnPoltava.setOnClickListener {
            zipCode = ZIP_POLTAVA
            tvCity.text = "Ви обрали Полтава"
        }
        val btnRivne = findViewById<Button>(R.id.btnRivne)
        btnRivne.setOnClickListener {
            zipCode = ZIP_RIVNE
            tvCity.text = "Ви обрали Рівне"
        }
        val btnSimferopol = findViewById<Button>(R.id.btnSimferopol)
        btnSimferopol.setOnClickListener {
            zipCode = ZIP_SIMFEROPOL
            tvCity.text = "Ви обрали Сімферополь"
        }
        val btnSumy = findViewById<Button>(R.id.btnSumy)
        btnSumy.setOnClickListener {
            zipCode = ZIP_SUMY
            tvCity.text = "Ви обрали Суми"
        }
        val btnTernopil = findViewById<Button>(R.id.btnTernopil)
        btnTernopil.setOnClickListener {
            zipCode = ZIP_TERNOPIL
            tvCity.text = "Ви обрали Тернопіль"
        }
        val btnUzhhorod = findViewById<Button>(R.id.btnUzhhorod)
        btnUzhhorod.setOnClickListener {
            zipCode = ZIP_UZHHOROD
            tvCity.text = "Ви обрали Ужгород"
        }
        val btnVinnytsya = findViewById<Button>(R.id.btnVinnytsya)
        btnVinnytsya.setOnClickListener {
            zipCode = ZIP_VINNYTSYA
            tvCity.text = "Ви обрали Вінницю"
        }
        val btnZaporizhzhya = findViewById<Button>(R.id.btnZaporizhzhya)
        btnZaporizhzhya.setOnClickListener {
            zipCode = ZIP_ZAPORIZHZHYA
            tvCity.text = "Ви обрали Запоріжжя"
        }
        val btnZhytomyr = findViewById<Button>(R.id.btnZhytomyr)
        btnZhytomyr.setOnClickListener {
            zipCode = ZIP_ZHYTOMYR
            tvCity.text = "Ви обрали Житомир"
        }
    }
}
