# ☀️ Weather Broadcaster – Observer Design Pattern in Java

A simple, beginner-friendly implementation of the **Observer Design Pattern** using Java. This project simulates a real-world weather broadcasting system where multiple devices (observers) receive updates from a central weather station (publisher).

---

## 📦 Overview

This project demonstrates how the Observer Pattern decouples the **publisher (WeatherInfo)** from its **subscribers (WeatherMobileApp, WeatherInfoDisplayBoard)**.

- When weather changes, all registered subscribers are notified.
- New subscribers can be added or removed **without changing the publisher** code.

---

## 🧠 Design Pattern Used

### ➤ Observer Design Pattern

> *Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.*

- **Publisher Interface** – manages subscribers
- **Subscriber Interface** – defines how observers are updated
- **WeatherInfo (Publisher)** – holds weather data and notifies subscribers
- **WeatherMobileApp & DisplayBoard (Subscribers)** – react to updates in their own way

---

## 🏗️ Project Structure

src/
└── main/
└── java/
└── com/
└── scaler/
└── ObserverDesignPattern/
├── Publisher.java
├── Subscriber.java
├── WeatherInfo.java
├── WeatherMobileApp.java
├── WeatherInfoDisplayBoard.java
└── WeatherStation.java

