[//]: # (![CurseForge Downloads]&#40;https://img.shields.io/curseforge/dt/923669?style=for-the-badge&logo=curseforge&#41;)

[//]: # (![CurseForge Version]&#40;https://img.shields.io/curseforge/v/923669?style=for-the-badge&logo=curseforge&#41;)

[//]: # (![Modrinth Downloads]&#40;https://img.shields.io/modrinth/dt/engHtMVe?style=for-the-badge&logo=modrinth&#41;)

[//]: # (![Modrinth Version]&#40;https://img.shields.io/modrinth/v/engHtMVe?style=for-the-badge&logo=modrinth&#41;)

# Ex Nihilo: Sequentia - JEI Addon for Minecraft

Addon for Ex Nihilo: Sequentia to add support for JEI

# Discord

Ex Nihilo: Sequentia - JEI Addon is on the NovaMachina Mods [discord server](https://discord.gg/CJyAkuw) where you can chat with other Ex Nihilo: Sequentia users and the developers.

# Translating

If you would like to help translate Ex Nihilo: Sequentia, please create a pull request with your translation.

# License

[![](https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png)](http://creativecommons.org/licenses/by-nc-sa/4.0/)

The source code of this work is licensed under a [Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License](http://creativecommons.org/licenses/by-nc-sa/4.0/).

Artwork of this mod is licensed under an All rights reserved license: Copyright &copy;2023 NovaMachina-Mods All rights reserved.

# Maven

Ex Nihilo: Sequentia - JEI Addon is avaliable via the [NovaMachina Mods artifact repository](https://cloudsmith.io/~novamachina-mods/repos/ex-nihilo-sequentia/packages/) for developers wishing to utilize its API.

Add the following to your `build.gradle`:

```groovy
repositories {
    maven {
        url = "https://dl.cloudsmith.io/public/novamachina-mods/releases/maven/"

    }
}

dependencies {
    implementation "novamachina.exnjei:exnjei:${exnjei_version}"
}
```

Add the following to your `gradle.properties` (see [Maven](https://cloudsmith.io/~novamachina-mods/repos/ex-nihilo-sequentia/packages/) for the list of available versions):

```properties
exnjei_version: 1.20.4-1.0.0.build.1
```

[![Hosted By: Cloudsmith](https://img.shields.io/badge/OSS%20hosting%20by-cloudsmith-blue?logo=cloudsmith&style=for-the-badge)](https://cloudsmith.com)

Package repository hosting is graciously provided by  [Cloudsmith](https://cloudsmith.com).
Cloudsmith is the only fully hosted, cloud-native, universal package management solution, that
enables your organization to create, store and share packages in any format, to any place, with total
confidence.
