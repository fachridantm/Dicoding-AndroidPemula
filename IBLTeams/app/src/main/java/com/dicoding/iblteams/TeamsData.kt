package com.dicoding.iblteams

object TeamsData {
    private val teamNames = arrayOf(
        "Amartha Hangtuah Jakarta",
        "Bali United Basketball Club",
        "Bima Perkasa Jogja",
        "Indonesia Patriots",
        "Louvre Dewa United Surabaya",
        "NSH Mountain Gold Timika",
        "Pacific Caesar Surabaya",
        "Pelita Jaya Bakrie Jakarta",
        "Prawira Bandung",
        "Satria Muda Pertamina Jakarta",
        "Satya Wacana Saints Salatiga",
        "West Bandits Solo"
    )
    private val teamManagement = arrayOf(
        "Manajer Umum\t : Ferri Jufri\n" +
                "Manajer\t : Leonardo Niki\n" +
                "Kepala Pelatih\t : Rastafari Horongbala\n" +
                "Asisten Pelatih\t : Harry Prayogo\n" +
                "Asisten Pelatih\t : Ary Sapto Nugroho\n" +
                "Ofisial\t : Sukamto\n" +
                "Ofisial\t : Andreas Riada",

        "Manajer\t : Sigit Sugiantoro\n" +
                "Asisten Manajer\t : Hoi Yi Heidy\n" +
                "Pelatih\t : Alex Stefanosky\n" +
                "Asisten Pelatih\t : I Gusti Rusta Wijaya\n" +
                "Asisten Pelatih\t : I Gusti Ngurah Teguh\n" +
                "Ofisial\t : Daniel Oktavianus\n" +
                "Ofisial\t : Alfian Indra Yudha\n" +
                "Ofisial\t : Yahya Saifudin",

        "Pemilik\t : dr. Edy Wibowo, Sp.M., M.PH\n" +
                "Manajer\t : Dyah Ayu Pratiwi\n" +
                "Kepala Pelatih\t : David Reynard Singleton\n" +
                "Asisten Pelatih\t : Kartika Siti Aminah\n" +
                "Ofisial\t : Masruri\n" +
                "Ofisial\t : Fransisca Juniati\n" +
                "Ofisial\t : Eri Ramadhan Ekaputra\n" +
                "Ofisial\t : Laksyit Bayu Septagiri",

        "Manajer\t : Andy Poedjakesuma\n" +
                "Pelatih\t : Youbel Sondakh\n" +
                "Assisten Pelatih\t : Koko Heru Setyo Nugroho\n" +
                "Assisten Pelatih\t : Andrie Ekayana Satya Sentosa\n" +
                "Assisten Pelatih\t : Derry Drew\n" +
                "Ofisial\t : Muslihudin \n" +
                "Ofisial\t : Raul JR Parayno Romero\n" +
                "Ofisial\t : Endang Mukhlisin ",

        "Presiden\t : Erick Herlangga\n" +
                "Vice President\t : Joko Utomo\n" +
                "Chief Financial Officer\t : Andreas\n" +
                "Manajer\t :  Giovanni Andrea\n" +
                "Kepala Pelatih\t : Andika Supriadi Saputra",

        "Manajer\t : Yusuf Arlan Ruslim\n" +
                "Kepala Pelatih\t : Antonius Ferry Rinaldo\n" +
                "Asisten Pelatih\t : Antonius Joko Endratmo\n" +
                "Asisten Pelatih\t : Agus Pamungkas Batbual\n" +
                "Asisten Pelatih\t : Ruspin Gultom\n" +
                "Ofisial\t : Mefi Gayus Marani\n" +
                "Ofisial\t : Ahmad Sofyan\n" +
                "Ofisial\t : Yogha Rasta Aditya C",

        "Manajer\t : Ade Nopriansyah\n" +
                "Pelatih\t : R. Aries Herman M\n" +
                "Assisten Pelatih\t : Moses Foresto\n" +
                "Assisten Pelatih\t : Bayu Pramboro\n" +
                "Ofisial\t : Bambang Susanto\n" +
                "Ofisial\t : Soegiono Hartono\n" +
                "Utilitas\t : Jimmy Indrata\n" +
                "Utilitas\t : Kasjiono",

        "Ketua Umum\t : Andiko Ardi Purnomo\n" +
                "Sekretaris\t : Cyrus Harsaningtyas\n" +
                "Manajer Umum\t : Fictor Gideon Roring\n" +
                "Manajer\t : Nugroho Budi Cahyono\n" +
                "Pelatih\t : Ocky Tamtelahitu\n" +
                "Asisten Pelatih\t : Hermanto\n" +
                "Asisten Pelatih\t : Yudhi Mardiansyah\n" +
                "Utilitas\t : Agus Ryanto\n" +
                "Ofisial\t : Brian Reggie Suwandy",

        "Manajer\t : Syarel Hasan\n" +
                "Pelatih\t : Andre Yuwadi\n" +
                "Asisten Pelatih\t : Andri Malay\n" +
                "Asisten Pelatih\t : Muhammad Hosim\n" +
                "Ofisial\t : Encep Farlan Sutara\n" +
                "Ofisial\t : Ali Munandar\n" +
                "Ofisial\t : Rizki Hamdani\n" +
                "Dokter\t : dr.Alvin Wiraharja ,Sp.KO\n" +

        "Manajer Umum\t : Riska Natalia Dewi\n" +
                "Kepala Pelatih\t : Milos Pejic \n" +
                "Asisten Pelatih\t : Ismael\n" +
                "Asisten Pelatih\t : Muhammad Gofar\n" +
                "Asisten Pelatih\t : Abdurrachman\n" +
                "Ofisial\t : Mohamad Tohirno\n" +
                "Ofisial\t : Amriansyah Syetiawinanda\n" +
                "Ofisial\t : Taufik",

        "Manajer\t : Zaki Iskandar\n" +
                "Pelatih\t : Efri Meldi\n" +
                "Ofisial\t : Dodik Tri Purnomo",

        "Manajer\t : CESAR WILHELEM HARRY CHRISTIAN\n" +
                "Pelatih\t : Jap Ricky Lesmana\n" +
                "Asisten Pelatih\t : Anas Wahyudi\n" +
                "Asisten Pelatih\t : Rizky\n" +
                "Ofisial\t : Danny Mulya Kusuma\n" +
                "Ofisial\t : Otay Tahyat\n" +
                "Utilitas\t : Darsono\n" +
                "Utilitas\t : Rivan Ardyan"
    )
    private val teamProfiles = arrayOf(
        "Sejak berdiri tahun 1995, klub basket Hangtuah menjadi salah satu kekuatan yang tak bisa dianggap remeh di basket tanah air. Catatan prestasi di masa Kobatama, IBL era lama, NBL Indonesia, hingga IBL era baru cukup baik. Bahkan di era NBL Indonesia, Hangtuah selalu menjadi langganan tampil di Championship Series. Hanya saja langkah mereka terhenti saat berhadapan dengan kekuatan besar basket Indonesia seperti CLS Knights, Pelita Jaya, Aspac Jakarta bahkan Satria Muda.\n" +
                "Klub Hangtuah memiliki nama cukup besar di perbolabasketan Jakarta. Klub ini kemudian mengambil hak peserta Kobatama dari sesama klub Jakarta Buls pada tahun 2006. Mulailah berkibar dengan nama Hangtuah Buls.\n" +
                "Hangtuah kemudian identik dengan wilayah Sumatera Selatan. Pada awalnya, tim ini bekerja sama dengan Pengurus Provinsi Perbasi Sumatera Selatan, Yayasan Hangtuah Indonesia, dan Pemerintah Kabupaten Musi Banyuasin (MUBA).  Nama klubnya menjadi Muba Hangtuah. Mereka berhasil menjadi juara Kobatama 2007- 2008 setelah di final menundukkan tim Pupuk Iskandar Muda Nangroe Aceh Darussalam (PIMNAD) 75-62 pada laga final di Stadion Tenis Indoor Palembang, 17 Februari 2008. Ketika itu Hangtuah ditangani pelatih Ocky Tamtelahitu.\n" +
                "Tahun yang sama mereka mengambil alih manajemen tim Indonesia Muda guna mengikuti kompetisi tertinggi Indonesia, IBL dengan nama Hangtuah Sumsel Indonesia Muda.\n" +
                "Tim ini sekarang kita kenal dengan nama Amartha Hangtuah. Karena pihak sponsor yang meminta untuk memberikan tambahan nama di depan.\n" +
                "Hangtuah juga pernah mengenyam kerasnya kompetisi ASEAN Basketball League. Mereka memakai nama Laskar Dreya South Sumatera yang mengikuti kompetisi di musim 2014. Meski hasilnya kurang memuaskan, setidaknya mereka pernah mewakili Indonesia di tingkat internasional. Di era pelatih Andika Supriadi Saputra, Hangtuah bisa masuk semifinal IBL 2017-2018. Sayangnya mereka harus menyerah 1-2 dari Satria Muda Pertamina Jakarta.\n" +
                "Hangtuah saat ini dikenal sebagai klub dengan skuad muda paling banyak. Para pemain muda itu terus mengasah diri menjadi lebih baik di kompetisi basket tanah air. Setelah sempat terpuruk di awal musim kompetisi 2020, mereka kembali menggeliat. Rastafari Horongbala berhasil membangkitkan semangat pemain muda Hangtuah untuk kembali mengejar prestasi.\n" +
                "\n" +
                "Home Base: Lapangan Margasatwa\n" +
                "Alamat: Jl. Kemang Selatan XII E no 1 Jakarta Selatan",

        "Bali United Basketball Club telah hadir untuk masyarakat Bali dan akan bermain di kompetisi tertinggi Indonesian Basketball League (IBL) 2021. Tentu menjadi kabar gembira untuk masyarakat Bali karena memiliki tim basket pria profesional pertama dari pulau dewata.\n" +
                "Pasalnya, Bali adalah penghasil pemain basket profesional legendaris seperti Putu Donnie Hermawan, Cokorda Raka, dan Tri Adnyana Loka. Namun mereka selama ini tidak pernah membela tanah kelahiran karena belum ada klub profesional yang berkompetisi di kasta tertinggi Liga Basket Indonesia. Bali United Basketball Club diperkenalkan ke masyarakat luas pada hari Jumat, 18 Desember 2020 pada pukul 15.00 WITA secara virtual press conference dengan tagline Bali Bernyali.\n" +
                "Tim basket profesional asal Bali ini hadir membawa visi untuk menjadi tim bola basket yang unggul di Indonesia serta menjadi pusat pertumbuhan untuk bakat-bakat olahraga bola basket. Misinya antara lain adalah mencetak prestasi di Indonesia Basketball League (IBL), membina bakat muda lokal Bali di bidang bola basket, menumbuhkan jaringan komunitas bola basket yang luas di pulau Bali, dan menuju prospek ke depan sebagai tim yang go-internasional.\n" +
                "\"Bali United Basketball Club adalah tim basket pertama yang hadir dari pulau Bali dan akan berkompetisi di IBL. Kehadiran kami tentu ingin menunjukkan bahwa tim ini bisa berprestasi di level nasional meskipun kami tim baru. Kami berharap bakat-bakat potensial di bidang olahraga basket ini juga banyak hadir dari pulau Bali dan kedepannya kami juga bisa berprestasi di level Internasional,\" ungkap Philmon Tanuri, selaku Presiden Bali United Basketball Club.\n" +
                "Sementara pelatih kepala tim basket Bali United, Aleksandar Stefanovski mengungkapkan rasa bahagianya dapat menjadi bagian dari tim Bali United. Pelatih yang memiliki FIBA Coaching Certificate, Macedonian Basketball Federation ini memiliki target untuk membawa tim asal pulau dewata ini berprestasi nasional.\n" +
                "\"Saya sangat senang dapat bergabung dengan Bali United Basketball Club. Kita tahu Bali United adalah tim sepak bola dengan suporter yang fanatik, namun kini mereka juga memiliki tim basket. Saya sangat bangga menjadi bagian dari Bali United. Bali United Basketball Club adalah tim baru yang bermain di kasta tertinggi Liga Nasional. Tentu menjadi sebuah tantangan untuk saya sebagai pelatih mempersatukan visi dan misi bermain tim ini.\n" +
                "Tapi target saya ingin membawa tim ini menjadi tim yang terbaik di kompetisi yang akan datang,\" ungkap Coach Aleksandar. Pelatih asal Makedonia Utara ini akan didampingi dua pelatih lokal yang sudah memiliki nama di kancah nasional bola basket asal Bali. Mereka adalah IGN Rusta Wijaya dan IGN Teguh Putra Negara sebagai asisten pelatih yang akan mendampingi Coach Aleksandar",

        "Bima Perkasa dulu bernama Bima Sakti. Sebuah nama yang memang menunjukkan perbedaan background kedaerahan. Tetapi karena sama di kata depannya, sehingga mudah diingat. Bima Sakti dikenal sebagai salah satu galaksi di tata surya kita. Sementara, Bima Perkasa dengan logo tokoh pewayangan Bima langsung identik dengan budaya Jawa. Bima adalah ksatria putra raja Pandu Dewanata dari Hastinapura. Bima digambarkan sebagai sosok yang kuat, dan putra kedua dari lima bersaudara yang dikenal sebagai Pandawa Lima.\n" +
                "Nah, kita mulai dari Bima Sakti terlebih dahulu. Klub Bimasakti merupakan hasil merger dari klub-klub basket pada zamannya seperti Goodyear dan Bridgestone, nama yang mengadopsi dari merk ban. Yayasan Bimasakti terdaftar secara legal pada tahun 1989, yayasan ini dikelola secara gotong royong. Saat ini ketua yayasan dipegang oleh Setyawan Subandi. Mereka bermarkas di GOR Bima Sakti berkapasitas 2.500 orang, GOR Bima Sakti berdiri di atas lahan 6.700 meter persegi, GOR ini diresmikan pada tahun 1992. Di era 90-an, klub ini berlaga dengan nama tenar Bima Sakti Nikko Steel. Hingga era NBL Indonesia.\n" +
                "Setelah NBL Indonesia berakhir, para pemain Bima Sakti kebingungan karena tidak ada kejelasan dari klubnya. Akhirnya pada 1 Desember 2016, muncul berita yang menjadi titik terang dari tim ini. Ternyata Bima Sakti resmi diboyong ke Jogjakarta, dan mengganti nama menjadi Bima Perkasa Jogja. Dengan nama baru tersebut, mereka mengarungi kompetisi IBL 2016. Beberapa nama pemain bintang Bima Sakti masih ada di klub ini seperti Yanuar Dwi Priasmoro, Alan As'adi, dan Restu Dwi Purnomo.\n" +
                "Seiring berjalan waktu, Bima Perkasa Jogja dilirik perusahaan daerah. Mereka dianggap mampu mempromosikan daerahnya dengan baik. Akhirnya pada musim 2016-2017, nama resmi klub ini menjadi Bank BPD DIY Bima Perkasa.\n" +
                "Di bawah kepemimpinan pelatih Raoul Miguel Hadinoto, Bima Perkasa bukanlah tim yang bisa dianggap remeh. Meski tidak meramaikan persaingan papan atas, namun Bima Perkasa bisa mengancam tim-tim besar. Bahkan beberapa kali di kompetisi resmi, Bima Perkasa mampu menumbangkan Satria Muda. Progres klub juga terus tumbuh dengan baik.\n" +
                "Namun yang paling utama adalah Bima Perkasa kini menjadi wadah bagi atlet-atlet basket dari Kota Pelajar. Mereka bisa merajut mimpi tampil di liga profesional bersama tim asal kota asalnya.\n" +
                "\n" +
                "Home Base : GOR Klebengan\n" +
                "Alamat : Jl. Agro, Caturtunggal, Depok, Sleman, Yogyakarta",

        "Indonesia Patriots adalah Tim Nasional Indonesia yang akan berlaga di event Internasional mewakili negara Indonesia. Terdiri dari gabungan pemain-pemain muda  terbaik mewakili daerah dan klubnya ini dinamakan Patriots untuk mewakili kebanggaan sebagai bangsa pejuang. Patriots mempunyai hashtag #bawabangga yang diciptakan oleh salah satu fansnya, dengan filosofi sebagai berikut: \n" +
                "Pregame: Putra putri terbaik bangsa yang dipilih membawa kebanggan untuk mewakili Indonesia berjuang demi prestasi bola basket tanah air",

        "Louvre Basketball Surabaya didirikan pada tahun 2019 sebagai salah satu klub pendatang baru di IBL (Indonesian Basketball League), yang merupakan liga basket tertinggi di Indonesia. Bermula dari dunia Esports, Louvre Esports yang lahir pada tahun 2017 terkenal sebagai tim tangguh Mobile Legend di tingkat Asia Tenggara dan juga memiliki tim PUBGM dan Free Fire di tingkat nasional yang selalu berada di posisi 3 besar.\n" +
                "Pada tahun 2019, Louvre Esports resmi memiliki lisensi untuk bergabung di liga basket professional Indonesia dibawah PT. Louvre Esports Indonesia, Louvre mempunyai target di papan atas di setiap musimnya sesuai dengan visi misi organisasi Esports yang sudah mempunyai prestasi internasional.",

        "Kisah berdirinya klub yang awalnya bernama NSH GMC tersebut bisa dibilang unik. Pada tahun 1994 silam para pemuda yang tinggal di kompleks olahraga eks Gaya Motor Cilincing menjadi pemrakarsa berdirinya sebuah kub basket. Mereka memberi nama GMC yang merupakan singkatan dari kata Gaya Motor Club. Antusiasme besar yang ditunjukkan para pemuda tersebut menggugah hati Na Sioe Hauw. Seorang pengusaha timah yang akhirnya bersedia mendanai klub tersebut. Kerja sama ini menghasilkan sebuah nama klub baru yang dipakai untuk mengikuti kompetisi yaitu NSH GMC.\n" +
                "Prestasi NSH GMC terbilang memuaskan di level amatir. Pada tahun 2007, mereka menjuarai kompetisi Divisi II di DKI Jakarta. NSH GMC pun mendapat promosi ke Divisi I DKI Jakarta. Di tahun berikutnya, mereka mampu berada di peringkat kedua kompetisi Divisi I DKI Jakarta dan peringkat ketiga Kejurnas Divisi I.\n" +
                "Keberhasilan tersebut membuat NSH GMC dipromosikan ke Kobatama (Kompetisi Bolabasket Divisi Utama). Hasilnya mereka menduduki posisi ketujuh. Pada 2010, mereka bertanding di PBL (Premiere Basketball League). Di PBL NSH GMC finis di urutan keenam.\n" +
                "NSH GMC lalu mengikuti liga profesinal Indonesia di musim 2011-2012. Mereka bergabung dengan NBL Indonesia, bersama Pacific Caesar Surabaya. Mereka menggunakan nama NSH GMC Riau. Konsistensi NSH sebagai klub profesional terus ditunjukkan hingga NBL digantikan oleh IBL. Dari situ, NSH mulai menemukan titik balik prestasi tim.\n" +
                "Dimulai dari Maykel S.D. Ferdinandus yang berhasil membawa NSH bisa meramaikan persaingan playoff IBL 2016-2017. Sayangnya setelah itu Coach Inyo pamit dari NSH untuk musim berikutnya. Tetapi penerusnya berhasil membawa perubahan untuk NSH. Wahyu Widayat Jati yang berhasil mengubah wajah NSH dua musim beruntun. Puncaknya pada IBL 2018-2019 NSH menduduki puncak klasemen Divisi Merah di regular season. Meskipun pada akhirnya, NSH harus gugur di semifinal.\n" +
                "Potensi NSH sebagai tim basket juga sangat besar. Kini mereka bukan lagi tim yang hanya berisi pemain kelas dua dan tiga. NSH berubah menjadi tim yang berisi pemuda-pemuda berbakat yang siap mengguncang persaingan papan atas liga basket Indonesia.\n" +
                "Di tahun 2020 NSH Jakarta melakukan Merger dengan Klub Basket asal Timika ,dan sehingga menjadi NSH Mountain Gold TIMIKA.\n" +
                "\n" +
                "Home Base : GOR Sunter\n" +
                "Alamat : Jl. Danau Indah 6 Blok A7, No.3, Sunter, Jakarta Utara",

        "Pacific Caesar Surabaya merupakan salah satu klub basket tertua di Indonesia. Setelah sempat terseok-seok di liga basket profesional Indonesia, kini mereka menjadi salah satu klub yang menjanjikan. Eksistensi Pacific Caesar sebagai klub basket juga tak perlu diragukan lagi, karena mereka sudah lebih dari setengah abad.\n" +
                "Klub Pacific berdiri pada tahun 1968. Tepatnya pada tanggal 8 mei 1968 sebagai klub amatir. Pacific didirikan oleh Bambang Susanto sejak usia 17 tahun, dan berlajut mengelola klub ini hingga sekarang. Impian Pak Bambang dalam mendirikan Pacific sebenarnya sederhana. Dia ingin mendirikan sebuah sekolah basket untuk anak muda, dan sekarang Pacific sudah lengkap sebagai klub. Punya tim profesional, pembinaan yang berjalan seiring, serta GOR sebagai fasilitas penunjang utama.\n" +
                "Perjalanan Pacific dalam kompetisi basket profesional dimulai tahun 1992 di Kompetisi Basket Utama (Kobatama). Selain Pacific saat itu ada tim asal Jawa Timur juga yakni Golden Hand dan Halim Kediri. Setelah berjalan sekian lama, Pacific menyatakan berhenti dari liga selama satu dekade (2000-2010).\n" +
                "Mereka sempat mencoba peruntungan di Premier Basketball League (PBL). Pada PBL musim 2010-2011, Pacific menjadi runner-up. Pacific pun akhirnya kembali ke kasta tertinggi bola basket tanah air.\n" +
                "Pacific mulai tampil kembali di kancah basket nasional tepatnya pada NBL Indonesia 2011-2012. Tapi selama empat tahun keikutsertaannya, Pacific selalu gagal mendapatkan hasil positif. Pacific selalu menghuni papan bawah klasemen di musim reguler. Berbagai cara dilakukan Pacific untuk meningkatkan prestasi, seperti mengganti pelatih. Pacific pernah dipoles oleh pelatih asal Filipina, Arturo Lozada Cristobal. Lalu di musim berikutnya (2012-2013) mereka dipimpin oleh Eddy Santoso. Kedua pelatih ini bergantian menangani Pacific di dua musim selanjutnya. Namun yang terakhir membesut Pacific di NBL Indonesia 2014-2015 adalah Arturo Lozada Cristobal.\n" +
                "Pada IBL 2016, Pacific Caesar tampil dengan wajah baru. Coach Bai (Arturo Lozada Cristobal) tak lagi menjadi pelatih kepala. Pacific ditangani sendiri oleh Bambang Susanto yang notabene juga sebagai pemilik klub. Suk Fuk -panggilan akrabnya- kala itu didampingi oleh asisten pelatih, almarhum Hari Suharsono. Hasilnya sama saja, Pacific Belum mendapatkan hasil maksimal . Karena mereka tampil dengan wajah-wajah baru pemain muda.\n" +
                "Performa Pacific meningkat tajam saat di era IBL 2017. Mereka diuntungkan dengan kebijakan liga yang memasukkan dua pemain asing. Manajemen Pacific sangat jeli memilih pemain. Mereka mendapatkan guard asal Amerika Serikat, David Seagers, dan forward dari Kanada, Kevin Loiselle. Keberadaan mereka berhasil membawa Pacific meloncat ke papan atas, sekaligus untuk pertama kalinya Pacific bisa tampil di babak playoff. Bisih sebagai pelatih juga masuk nominasi Coach of The Year IBL 2016. Sayangnya mereka gagal melanjutkan langkah setelah kalah dua laga di babak playoff dari Aspac Jakarta.\n" +
                "Prestasi gemilang ditunjukkan Pacific dua musim beruntun setelahnya. Mereka masuk playoff di IBL 2017-2018, bahkan bisa sampai ke semifinal di IBL 2018-2019. Pacific bukan lagi tim yang jadi bulan-bulanan di liga. Mereka kini menjelma jadi salah satu kekuatan besar basket Indonesia. Orang-orang mungkin melihat prestasi Pacific beberapa tahun terakhir. Namun sejatinya Pacific adalah tim besar, dengan sejarah panjang dan prestasi yang membanggakan.\n" +
                "\n" +
                "Home Base : GOR Pacific Caesar\n" +
                "Alamat : Jl. Raya Gading Pantai No.4, Surabaya",

        "Pelita Jaya Basketball Club yang didirikan pada tahun 1987 adalah sebuah klub bola basket bentukan Kelompok Usaha Bakrie sebagai sumbangsih kepada dunia olahraga Indonesia, khususnya bola basket. Selama 30 tahun berdiri, Pelita Jaya Basketball Club sudah menjuarai berbagai turnamen, termasuk di antaranya tiga kali juara liga basket nasional.\n" +
                "Sebagai salah satu klub bola basket besar di Indonesia, Pelita Jaya Basketball Club memiliki kelompok fans yang tersebar hampir di seluruh Indonesia. Mereka menyebut dirinya sebagai PJ Holic. Sampai saat ini, jumlahnya terus menerus bertambah seiring dengan meningkatnya performa klub yang mampu menggaet pecinta olahraga bola basket untuk juga menyukai Pelita Jaya Basketball Club.\n" +
                "\n" +
                "Home Base : Gor Soemantri Brodjonegor, Kuningan, Jakarta",

        "Prawira Bandung adalah salah satu klub basket yang bertanding di IBL(INDONESIAN Basketball League), berdiri sejak tahun 2018, klub basket yang sebelumnya bernama Garuda Bandung pada musim kompetisi IBL 2018/2019 berganti nama menjadi Prawira Bandung. Walau tak banyak melakukan perubahan tim Prawira Bandung siap menjadi salah satu penantang kompetisi tertinggi basket di indonesia. Sebutan khusus untuk penggemar/pendukung klub Prawira Bandung adalah Family Prawira.\n" +
                "\n" +
                "Home Base : Gor Citra Arena Bandung\n" +
                "Alamat : Jl. Cikutra No.278, Neglasari, Bandung",

        "Satria Muda didirikan pada 28 Oktober 1993 sebagai salah satu klub pendatang baru di KOBATAMA (Kompetisi Bola Basket Utama), yang merupakan liga basket tertinggi di Indonesia pada waktu itu. Perjalanan Satria Muda dimulai dari divisi 2 KOBATAMA, tahun 1995, Satria Muda berhasil mendapatkan tiket promosi ke divisi 1 KOBATAMA melalui pertandingan babak promosi-degradasi.\n" +
                "Pada tahun 1998, Grup Mahaka yang dinahkodai oleh Erick Thohir bersama beberapa rekanan mengambil alih pengelolaan klub Satria Muda. Kini, Satria Muda Pertamina berada di bawah naungan PT. Indonesia Sport Venture dan secarakontinyu terus berkompetisi di liga basket indonesia atau IBL, serta menyumbangkan pemain-pemainnya untuk memperkuat tim nasional Indonesia pada berbagai kesempatan. Selama 26 tahun perjalanannya sebagai sebuah organisasi, Satria Muda telah mampu mengumpulkan 10 gelar juara Indonesia. Gelar-gelar juara ini merupakan salah satu bentuk manifestasi dari slogan yang dijunjung oleh organisasi Satria Muda, yaitu JUARA INDONESIA! INDONESIA JUARA!.",

        "Satya Wacana Salatiga adalah sebuah tim basket yang berhome base dikota Salatiga, Jawa Tengah. Tim ini mulai terbentuk pada tanggal 1 Agustus 2007. Sebelum berlaga di IBL Indonesia seperti saat ini, tim ini bernama pusdiklat Bola Basket FTI-UKSW. Saat itu tim FTI-UKSW hanya berlaga di tingkat mahasiswa, dan pada tahun pertamanya berhasil menduduki posisi runner up dalam kejurnas antar universitas yang diadakan di Surabaya.\n" +
                "Berkembangnya setiap pemain yang ada dalam Pusdiklat Bola Basket FTI-UKSW tentu saja berbanding lurus dengan prestasi yang diraih dan membuka kesempatan untuk tim ini bertanding dalam kasta liga yang lebih tinggi. Dari tim yang bertanding di level mahasiswa, tim ini telah menjelma menjadi sebuah tim basket yang berlaga dalam liga kasta tertinggi bola basket nasional yaitu NBL Indonesia (2010-2015) dan IBL Indonesia (2016 - sekarang).\n" +
                "Tim Satya Wacana Salatiga telah mengikuti 9 musim liga kasta tertinggi di Indonesia dari tahun 2010 - 2018. Dari tahun pertama yang menjadi juru kunci, dan terus berkembang di setiap musim berikutnya dan sekarang telah menjadi salah satu tim papan tengah IBL Indonesia. Satya Wacana Salatiga dapat terus berkembang karena tim ini beranggotakan pemain - pemain muda yang potensial. Selain pemain, tentunya tim ini juga didukung dengan tim pelatih yang profesional serta manajemen yang professional di bawah PT SMS (PT Satya Mitra Sejahtera). Saat ini IBL Idonesia diikuti oleh 10 tim, dan tim Satya Wacana adalah satu - satunya tim berbasis perguruan tinggi yang ikut berlaga di IBL Indonesia.\n" +
                "\n" +
                "Home Base : Gor Putra Abadi\n" +
                "Alamat : Jl. Jendral Sudirman No.196, Mrican, Salatiga",

        "Berawal di tahun 2018 sebagai hobi dan komunitas, 2 bersaudara bernama James Winson dan William Ongkowijaya mendirikan komunitas ini karena kecintaannya terhadap bola basket. Komunitas ini diharapkan bisa menjadi wadah untuk mengembangkan bakat dan talenta bibit-bibit pemain basket. Dari basket jalanan, lalu menjadi juara di divisi 1 KU 24-35 DKI Jakarta, dan pada September 2020 klub ini dipastikan akan mengikuti kompetisi tertinggi di tanah air yaitu Indonesian Basketball League (IBL) dan akan mewakili kota Solo, Jawa Tengah.\n" +
                "\n" +
                "Homebase : Sritex Arena, Solo\n" +
                "Alamat : Jl. R.M. Said no. 59, Ketelan, Kec. Banjarsari, Kota Surakarta, Jawa Tengah, 57132"
    )
    private val teamImages = intArrayOf(
        R.drawable.amartha_hangtuah,
        R.drawable.bali_united,
        R.drawable.bima_perkasa,
        R.drawable.indonesia_patriots,
        R.drawable.louvre_dewa,
        R.drawable.nsh_mountain,
        R.drawable.pacific_caesar,
        R.drawable.pelita_jaya,
        R.drawable.prawira_bandung,
        R.drawable.satria_muda,
        R.drawable.satya_wacana,
        R.drawable.west_bandits,
    )

    val listData: ArrayList<Teams>
        get() {
            val list = arrayListOf<Teams>()
            for (position in teamNames.indices) {
                val teams = Teams()
                teams.name = teamNames[position]
                teams.management = teamManagement[position]
                teams.profile = teamProfiles[position]
                teams.photo = teamImages[position]
                list.add(teams)
            }
            return list
        }
}