public static String GetTimeOfDay() {
    
    DateTime time = DateTime.Now;
    if (time.Hour >= 0 && time.Hour < 6)
        return "Night";
    if (time.Hour >= 6 && time.Hour < 12)
        return "Morning";
    if (time.Hour >= 12 && time.Hour < 18)
        return "Afternoon";
    return "Evening";
}