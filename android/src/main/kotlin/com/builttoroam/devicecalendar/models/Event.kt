package com.builttoroam.devicecalendar.models


class Event {
    var title: String? = null
    var eventId: String? = null
    var calendarId: String? = null
    var description: String? = null
    var start: Long? = null
    var end: Long? = null
    var startTimeZone: String? = null
    var endTimeZone: String? = null
    var allDay: Boolean? = null
    var location: String? = null
    var url: String? = null
    var attendees: MutableList<Attendee>? = null
    var recurrenceRule: RecurrenceRule? = null
    var organizer: Attendee? = null
    var reminders: MutableList<Reminder>? = null
    var availability: Availability? = null
}