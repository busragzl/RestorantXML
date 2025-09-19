# 🍽️ RestorantXML - Android Restaurant Discovery App

Modern ve kullanıcı dostu bir restoran keşif uygulaması. Android Studio ile geliştirilmiş, Material Design prensiplerine uygun bir mobil uygulama.

## 📱 Uygulama Özellikleri

- **Modern UI/UX**: Material Design prensiplerine uygun tasarım
- **Responsive Layout**: Farklı ekran boyutlarına uyumlu
- **Edge-to-Edge**: Modern Android deneyimi
- **Dropdown Menü**: Kullanıcı dostu navigasyon
- **Restoran Listesi**: RecyclerView ile performanslı liste
- **Kullanıcı Yönetimi**: Kayıt, giriş ve şifre sıfırlama

## 🎯 Aktivite Listesi

### 1. 🏠 MainActivity - Ana Sayfa
**Dosya**: `MainActivity.java` | `activity_main.xml`

**Özellikler**:
- Teal renkli header bölümü
- Hamburger menü ikonu (dropdown menü)
- Alışveriş sepeti ikonu
- Arama çubuğu ("Search for Shops and Restaurants")
- Restoran listesi (RecyclerView)
- ABC Restaurant kartları (5 adet)

**Ekran Görüntüsü**:
```
┌─────────────────────────┐
│ ☰ Header (Teal)     🛒 │
│ 🔍 Search Bar           │
├─────────────────────────┤
│ 🍽️ ABC Restaurant ⭐⭐⭐⭐⭐ │
│ Recommended        🪙18 │
├─────────────────────────┤
│ 🍽️ ABC Restaurant ⭐⭐⭐⭐⭐ │
│ Recommended        🪙18 │
├─────────────────────────┤
│ 🍽️ ABC Restaurant ⭐⭐⭐⭐⭐ │
│ Recommended        🪙18 │
└─────────────────────────┘
```

### 2. 🔐 LoginActivity - Giriş Sayfası
**Dosya**: `LoginActivity.java` | `activity_login.xml`

**Özellikler**:
- İllüstrasyon görseli
- "Sign Up" başlığı
- E-Mail girişi (work ikonu ile)
- Full Name girişi (profile ikonu ile)
- Mobile girişi (calling ikonu ile)
- Password girişi (password ikonu ile)
- Terms and Conditions metni
- Continue butonu (teal renkli)
- "Joined before? Login" linki

**Ekran Görüntüsü**:
```
┌─────────────────────────┐
│ 🎨 Illustration         │
│ Sign Up                 │
├─────────────────────────┤
│ 📧 E-Mail               │
│ 👤 Full Name            │
│ 📞 Mobile               │
│ 🔒 Password             │
├─────────────────────────┤
│ Terms and Conditions    │
│ [Continue] (Teal)       │
│ Joined before? Login    │
└─────────────────────────┘
```

### 3. 📝 SignUpActivity - Kayıt Sayfası
**Dosya**: `SignUpActivity.java` | `activity_signup.xml`

**Özellikler**:
- LoginActivity ile aynı layout
- Kayıt formu validasyonu
- Toast mesajları
- Başarılı kayıt sonrası SignUpSuccessActivity'ye geçiş

### 4. 🔑 PasswordActivity - Şifre Unutma
**Dosya**: `PasswordActivity.java` | `activity_password.xml`

**Özellikler**:
- Kedi illüstrasyonu (catillus.png)
- "Forgot Password?" başlığı (36sp, büyük)
- Açıklama metni
- Email/Mobile girişi (çerçevesiz)
- Submit butonu (teal renkli)

**Ekran Görüntüsü**:
```
┌─────────────────────────┐
│ 🐱 Cat Illustration     │
│ Forgot Password?        │
│ Don't Worry it happens. │
│ Please Enter an email   │
│ or Mobile associated    │
│ with your account       │
├─────────────────────────┤
│ 📧 Email ID or Mobile   │
│ [Submit] (Teal)         │
└─────────────────────────┘
```

### 5. 🔄 ResetPasswordActivity - Şifre Sıfırlama
**Dosya**: `ResetPasswordActivity.java` | `activity_password_reset.xml`

**Özellikler**:
- TV illüstrasyonu (restpass.png)
- "Reset" ve "Password" ayrı satırlarda
- New Password girişi (alt çizgi ile)
- Confirm Password girişi (alt çizgi ile)
- "Submitting" butonu (teal renkli)

**Ekran Görüntüsü**:
```
┌─────────────────────────┐
│ 📺 TV Illustration      │
│ Reset                   │
│ Password                │
│ Please enter your new   │
│ password below          │
├─────────────────────────┤
│ 🔒 New Password         │
│ ─────────────────────── │
│ 🔒 Confirm Password     │
│ ─────────────────────── │
│ [Submitting] (Teal)     │
└─────────────────────────┘
```

### 6. ✅ SignUpSuccessActivity - Kayıt Başarı
**Dosya**: `SignUpSuccessActivity.java` | `activity_signup_success.xml`

**Özellikler**:
- Başarı illüstrasyonu (illustration.png)
- Kağıt uçağı ikonu (airplane.png)
- "Signed up Successfully" mesajı
- Login butonu (teal renkli)
- LoginActivity'ye otomatik geçiş

**Ekran Görüntüsü**:
```
┌─────────────────────────┐
│ 🎨 Success Illustration │
│ ✈️ Paper Airplane       │
│ Signed up Successfully   │
│ [Login] (Teal)          │
└─────────────────────────┘
```

## 🛠️ Teknik Detaylar

### Kullanılan Teknolojiler
- **Android SDK**: Modern Android geliştirme
- **Java**: Programlama dili
- **XML**: Layout tasarımı
- **RecyclerView**: Performanslı liste görünümü
- **PopupWindow**: Dropdown menü
- **Material Design**: UI/UX prensipleri

### Proje Yapısı
```
app/
├── src/main/
│   ├── java/com/busragazel/restorantxml/
│   │   ├── MainActivity.java
│   │   ├── LoginActivity.java
│   │   ├── SignUpActivity.java
│   │   ├── PasswordActivity.java
│   │   ├── ResetPasswordActivity.java
│   │   ├── SignUpSuccessActivity.java
│   │   └── RestaurantAdapter.java
│   ├── res/
│   │   ├── layout/
│   │   │   ├── activity_main.xml
│   │   │   ├── activity_login.xml
│   │   │   ├── activity_signup.xml
│   │   │   ├── activity_password.xml
│   │   │   ├── activity_password_reset.xml
│   │   │   ├── activity_signup_success.xml
│   │   │   ├── item_restaurant_card.xml
│   │   │   └── popup_menu.xml
│   │   ├── drawable/
│   │   │   ├── ic_menu.xml
│   │   │   ├── ic_cart.xml
│   │   │   ├── ic_search.xml
│   │   │   ├── ic_coins.xml
│   │   │   ├── popup_menu_background.xml
│   │   │   └── menu_divider.xml
│   │   ├── values/
│   │   │   ├── colors.xml
│   │   │   └── strings.xml
│   │   └── mipmap/
│   └── AndroidManifest.xml
└── build.gradle
```

## 🚀 Kurulum ve Çalıştırma

### Gereksinimler
- Android Studio (Arctic Fox veya üzeri)
- Android SDK API 24+
- Java 8+

### Kurulum Adımları
1. Projeyi klonlayın:
   ```bash
   git clone https://github.com/yourusername/RestorantXML.git
   ```

2. Android Studio'da projeyi açın

3. Gradle sync işlemini tamamlayın

4. Uygulamayı çalıştırın:
   - Emülatör veya fiziksel cihaz seçin
   - Run butonuna tıklayın

## 📱 Kullanım

### Ana Menü Navigasyonu
1. **MainActivity**'de sol üstteki hamburger menü ikonuna (☰) tıklayın
2. Dropdown menüden istediğiniz aktiviteyi seçin:
   - **Login**: Giriş sayfası
   - **Sign Up**: Kayıt sayfası
   - **Forgot Password**: Şifre unutma
   - **Reset Password**: Şifre sıfırlama
   - **Sign Up Success**: Kayıt başarı sayfası

### Aktivite Geçişleri
- Tüm aktiviteler arasında sorunsuz geçiş
- Back button ile geri dönüş
- Otomatik aktivite kapanması

## 🎨 Tasarım Özellikleri

### Renk Paleti
- **Primary**: Teal/Mint Green (#64FCD9)
- **Background**: White (#FFFFFF)
- **Text**: Black (#000000)
- **Secondary**: Light Gray (#AAAAAA)

### UI Bileşenleri
- **Cards**: Rounded corners, elevation
- **Buttons**: Teal background, black text
- **Input Fields**: Clean, minimal design
- **Icons**: Vector drawables
- **Typography**: Sans-serif fonts

## 📸 Ekran Görüntüleri

> **Not**: Gerçek ekran görüntüleri için uygulamayı çalıştırıp screenshot alabilirsiniz.

### Önerilen Screenshot'lar:
1. **MainActivity**: Ana sayfa ve dropdown menü
2. **LoginActivity**: Giriş formu
3. **SignUpActivity**: Kayıt formu
4. **PasswordActivity**: Şifre unutma
5. **ResetPasswordActivity**: Şifre sıfırlama
6. **SignUpSuccessActivity**: Başarı sayfası

## 🔧 Geliştirme Notları

### Önemli Özellikler
- **EdgeToEdge**: Modern Android deneyimi
- **Responsive Design**: Farklı ekran boyutları
- **Material Design**: Google'ın tasarım prensipleri
- **Clean Code**: Okunabilir ve sürdürülebilir kod

### Gelecek Geliştirmeler
- [ ] Gerçek API entegrasyonu
- [ ] Kullanıcı kimlik doğrulama
- [ ] Restoran detay sayfaları
- [ ] Favoriler sistemi
- [ ] Push notifications
- [ ] Dark mode desteği

## 📄 Lisans

Bu proje MIT lisansı altında lisanslanmıştır. Detaylar için `LICENSE` dosyasına bakın.

## 👨‍💻 Geliştirici

**Büşra Gazel**
- GitHub: [@busragazel](https://github.com/busragazel)
- Email: your.email@example.com

## 🤝 Katkıda Bulunma

1. Fork yapın
2. Feature branch oluşturun (`git checkout -b feature/AmazingFeature`)
3. Commit yapın (`git commit -m 'Add some AmazingFeature'`)
4. Push yapın (`git push origin feature/AmazingFeature`)
5. Pull Request oluşturun

## 📞 İletişim

Proje hakkında sorularınız için:
- Issue açın
- Email gönderin
- Pull request gönderin

---

⭐ Bu projeyi beğendiyseniz yıldız vermeyi unutmayın!
