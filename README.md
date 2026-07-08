# 🚇 SubwaySystem

**The ultimate subway & railway management system for Paper servers.**

[![Version](https://img.shields.io/badge/version-1.0.0-blue.svg)](https://github.com/pashudzu/SubwaySystem)
[![Paper API](https://img.shields.io/badge/Paper-1.21.11-orange.svg)](https://papermc.io)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE)

---

## 📖 Description

**SubwaySystem** is a powerful Minecraft plugin that transforms how players travel on your server. Build massive subway networks, upgrade rails for incredible speeds, and create interactive subway maps—all while making metro travel faster than elytra!

This plugin was born from the need to make large subway systems (often built with immense effort) truly useful and competitive with elytra flight. Now your metro network can be the **fastest**, **coolest**, and **most rewarding** way to travel.

---

## ✨ Features

### 🚀 **Upgradable Rails**
- Upgrade powered rails through **4 levels**
- Each level increases speed significantly
- **Level 1**: Base speed (vanilla)
- **Level 2**: +50% speed
- **Level 3**: +100% speed (2x faster)
- **Level 4**: "HyperSpeed" — lightning-fast travel!

### 🗺️ **Interactive Subway Maps**
- **Record routes** by clicking rails with a map item
- Maps store entire subway lines with turn data
- Visual schematic display
- Share maps with other players!
- Automatic station detection

### 📊 **Dynmap Integration**
- Real-time subway network visualization
- Station markers with names and colors

### 🎯 **Additional Features**
- **Station management**: Create, rename, and manage stations
- **Line management**: Color-coding, naming, and route planning
- **Statistics**: Track usage, popularity, and player activity
- **Permissions**: Full permission support
- **Multi-language ready**

---

## 📋 Requirements

- **Server**: Paper 1.21.11 or higher
- **Java**: Java 21 or higher
- **Optional**: Dynmap (for web map)

---

## 🚀 Installation

1. Download the latest `SubwaySystem.jar` from [Releases](https://github.com/pashudzu/SubwaySystem/releases)
2. Place the JAR file in your server's `plugins` folder
3. Restart the server (or use `/reload` with caution)
4. Configure `plugins/SubwaySystem/config.yml` to your preferences
5. Enjoy your new subway system!

---

## 🎮 Commands

| Command | Description | Permission |
|---------|-------------|------------|
| `/subway help` | Show all commands | `subway.help` |
| `/subway map` | Open your subway map | `subway.map` |
| `/subway record` | Start recording a route | `subway.record` |
| `/subway upgrade` | Upgrade rail segment | `subway.upgrade` |
| `/subway station create <name>` | Create a station | `subway.admin` |
| `/subway station rename <new>` | Rename station | `subway.admin` |
| `/subway line create <name>` | Create new line | `subway.admin` |
| `/subway line color <color>` | Set line color | `subway.admin` |
| `/subway info` | Display current line info | `subway.info` |

---

## 🔧 Permissions

| Permission | Description |
|------------|-------------|
| `subway.*` | Full access to all features |
| `subway.user` | Basic user permissions |
| `subway.admin` | Administrative commands |
| `subway.build` | Build and modify network |

---
