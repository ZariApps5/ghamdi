package com.zariapps.quran.ghamdi.config

object ReciterConfig {
    const val RECITER_NAME = "Saad Al-Ghamdi"
    const val RECITER_NAME_ARABIC = "سعد الغامدي"
    const val APP_NAME = "Quran - Al-Ghamdi"
    const val PLAY_STORE_URL = "https://play.google.com/store/apps/details?id=com.zariapps.quran.ghamdi"

    const val BIOGRAPHY_ENGLISH = """Sheikh Saad ibn Ibrahim Al-Ghamdi is a prominent Saudi Quran reciter born on June 19, 1967, in Abha, Saudi Arabia. He memorized the entire Quran at an early age and received his education in Quranic sciences under distinguished scholars.

He is renowned worldwide for his deeply moving and spiritually uplifting recitation style. His voice carries a natural warmth and sincerity that has made him one of the most listened-to reciters across the Muslim world. He has led Tarawih prayers at the Grand Mosque in Makkah and other major mosques in Saudi Arabia.

Sheikh Al-Ghamdi's recordings are among the most widely distributed Quran recitations globally and have been cherished by millions of Muslims for their clarity, beauty, and heartfelt devotion."""

    const val BIOGRAPHY_ARABIC = """الشيخ سعد بن إبراهيم الغامدي، قارئ قرآن سعودي بارز، وُلد عام 1967م في أبها بالمملكة العربية السعودية. حفظ القرآن الكريم في سنّ مبكرة، وتلقّى علومه على يد كبار العلماء والمشايخ.

يشتهر الشيخ الغامدي بأسلوبه المؤثر في التلاوة الذي يجمع بين الخشوع والجمال، وهو من أكثر القراء استماعاً في العالم الإسلامي. تولّى إمامة صلاة التراويح في المسجد الحرام بمكة المكرمة وعدد من المساجد الكبرى في المملكة.

تُعدّ تلاواته من أوسع التسجيلات القرآنية انتشاراً في العالم، وقد أسهمت في ربط ملايين المسلمين بكلام الله تعالى."""


    private val audioFiles = mapOf(
        1 to "001-al-fatihah.lite.mp3",
        2 to "002-al-baqarah.lite.mp3",
        3 to "003-al-imran.lite.mp3",
        4 to "004-an-nisa.lite.mp3",
        5 to "005-al-maidah.lite.mp3",
        6 to "006-al-anam.lite.mp3",
        7 to "007-al-araf.lite.mp3",
        8 to "008-al-anfal.lite.mp3",
        9 to "009-at-taubah.lite.mp3",
        10 to "010-yunus.lite.mp3",
        11 to "011-hud.lite.mp3",
        12 to "012-yusuf.lite.mp3",
        13 to "013-ar-rad.lite.mp3",
        14 to "014-ibrahim.lite.mp3",
        15 to "015-al-hijr.lite.mp3",
        16 to "016-an-nahl.lite.mp3",
        17 to "017-al-isra.lite.mp3",
        18 to "018-al-kahf.lite.mp3",
        19 to "019-maryam.lite.mp3",
        20 to "020-ta-ha.lite.mp3",
        21 to "021-al-anbiya.lite.mp3",
        22 to "022-al-hajj.lite.mp3",
        23 to "023-al-muminun.lite.mp3",
        24 to "024-an-nur.lite.mp3",
        25 to "025-al-furqan.lite.mp3",
        26 to "026-ash-shuara.lite.mp3",
        27 to "027-an-naml.lite.mp3",
        28 to "028-al-qasas.lite.mp3",
        29 to "029-al-ankabut.lite.mp3",
        30 to "030-ar-rum.lite.mp3",
        31 to "031-luqman.lite.mp3",
        32 to "032-as-sajdah.lite.mp3",
        33 to "033-al-ahzab.lite.mp3",
        34 to "034-saba.lite.mp3",
        35 to "035-fatir.lite.mp3",
        36 to "036-ya-sin.lite.mp3",
        37 to "037-as-saffat.lite.mp3",
        38 to "038-sad.lite.mp3",
        39 to "039-az-zumar.lite.mp3",
        40 to "040-ghafir.lite.mp3",
        41 to "041-fussilat.lite.mp3",
        42 to "042-ash-shura.lite.mp3",
        43 to "043-az-zukhruf.lite.mp3",
        44 to "044-ad-dukhan.lite.mp3",
        45 to "045-al-jathiyah.lite.mp3",
        46 to "046-al-ahqaf.lite.mp3",
        47 to "047-muhammad.lite.mp3",
        48 to "048-al-fath.lite.mp3",
        49 to "049-al-hujurat.lite.mp3",
        50 to "050-qaf.lite.mp3",
        51 to "051-adh-dhariyat.lite.mp3",
        52 to "052-at-tur.lite.mp3",
        53 to "053-an-najm.lite.mp3",
        54 to "054-al-qamar.lite.mp3",
        55 to "055-ar-rahman.lite.mp3",
        56 to "056-al-waqiah.lite.mp3",
        57 to "057-al-hadid.lite.mp3",
        58 to "058-al-mujadilah.lite.mp3",
        59 to "059-al-hashr.lite.mp3",
        60 to "060-al-mumtahanah.lite.mp3",
        61 to "061-as-saff.lite.mp3",
        62 to "062-al-jumuah.lite.mp3",
        63 to "063-al-munafiqun.lite.mp3",
        64 to "064-at-taghabun.lite.mp3",
        65 to "065-at-talaq.lite.mp3",
        66 to "066-at-tahrim.lite.mp3",
        67 to "067-al-mulk.lite.mp3",
        68 to "068-al-qalam.lite.mp3",
        69 to "069-al-haqqah.lite.mp3",
        70 to "070-al-maarij.lite.mp3",
        71 to "071-nuh.lite.mp3",
        72 to "072-al-jinn.lite.mp3",
        73 to "073-al-muzammil.lite.mp3",
        74 to "074-al-muddaththir.lite.mp3",
        75 to "075-al-qiyamah.lite.mp3",
        76 to "076-al-insan.lite.mp3",
        77 to "077-al-mursalat.lite.mp3",
        78 to "078-an-naba.lite.mp3",
        79 to "079-an-naziat.lite.mp3",
        80 to "080-abasa.lite.mp3",
        81 to "081-at-takwir.lite.mp3",
        82 to "082-al-infitar.lite.mp3",
        83 to "083-al-mutaffifin.lite.mp3",
        84 to "084-al-inshiqaq.lite.mp3",
        85 to "085-al-buruj.lite.mp3",
        86 to "086-at-tariq.lite.mp3",
        87 to "087-al-ala.lite.mp3",
        88 to "088-al-ghashiyah.lite.mp3",
        89 to "089-al-fajr.lite.mp3",
        90 to "090-al-balad.lite.mp3",
        91 to "091-ash-shams.lite.mp3",
        92 to "092-al-lail.lite.mp3",
        93 to "093-ad-duha.lite.mp3",
        94 to "094-ash-sharh.lite.mp3",
        95 to "095-at-tin.lite.mp3",
        96 to "096-al-alaq.lite.mp3",
        97 to "097-al-qadr.lite.mp3",
        98 to "098-al-baiyyinah.lite.mp3",
        99 to "099-az-zalzalah.lite.mp3",
        100 to "100-al-adiyat.lite.mp3",
        101 to "101-al-qariah.lite.mp3",
        102 to "102-at-takathur.lite.mp3",
        103 to "103-al-asr.lite.mp3",
        104 to "104-al-humazah.lite.mp3",
        105 to "105-al-fil.lite.mp3",
        106 to "106-quraish.lite.mp3",
        107 to "107-al-maun.lite.mp3",
        108 to "108-al-kauthar.lite.mp3",
        109 to "109-al-kafirun.lite.mp3",
        110 to "110-an-nasr.lite.mp3",
        111 to "111-al-masad.lite.mp3",
        112 to "112-al-ikhlas.lite.mp3",
        113 to "113-al-falaq.lite.mp3",
        114 to "114-an-nas.lite.mp3",
    )

    fun getAudioAssetUri(surahNumber: Int): String {
        val filename = audioFiles[surahNumber] ?: error("No audio file for surah $surahNumber")
        return "file:///android_asset/audio/$filename"
    }
}
