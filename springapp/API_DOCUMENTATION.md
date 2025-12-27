# Remote Worker Check-In Tracking System - API Documentation

## Employee Management APIs

### Base URL: `/employees`

- **POST** `/employees` - Create new employee
- **GET** `/employees` - Get all employees
- **GET** `/employees/{id}` - Get employee by ID
- **PUT** `/employees/{id}` - Update employee
- **DELETE** `/employees/{id}` - Delete employee
- **GET** `/employees/code/{empCode}` - Get employee by employee code
- **GET** `/employees/department/{department}` - Get employees by department

## Attendance Log Management APIs

### Base URL: `/attendancelogs`

- **POST** `/attendancelogs` - Create new attendance log
- **GET** `/attendancelogs` - Get all attendance logs
- **GET** `/attendancelogs/{id}` - Get attendance log by ID
- **PUT** `/attendancelogs/{id}` - Update attendance log
- **DELETE** `/attendancelogs/{id}` - Delete attendance log
- **GET** `/attendancelogs/employee/{employeeCode}` - Get attendance logs by employee
- **GET** `/attendancelogs/date/{date}` - Get attendance logs by date
- **GET** `/attendancelogs/employee/{employeeCode}/date/{date}` - Get specific attendance log

## Attendance Record Management APIs

### Base URL: `/attendance-records`

- **POST** `/attendance-records` - Create new attendance record
- **GET** `/attendance-records` - Get all attendance records
- **GET** `/attendance-records/{id}` - Get attendance record by ID
- **PUT** `/attendance-records/{id}` - Update attendance record
- **DELETE** `/attendance-records/{id}` - Delete attendance record
- **GET** `/attendance-records/employee/{employeeCode}` - Get records by employee
- **GET** `/attendance-records/date/{date}` - Get records by date

## Admin User Management APIs

### Base URL: `/admin`

- **POST** `/admin/create` - Create new admin user
- **GET** `/admin` - Get all admin users
- **GET** `/admin/{id}` - Get admin user by ID
- **PUT** `/admin/{id}` - Update admin user

## Daily Attendance Summary APIs

### Base URL: `/daily-summary`

- **POST** `/daily-summary/create` - Create daily attendance summary
- **GET** `/daily-summary/employee/{id}?page=0&size=10` - Get summary by employee ID (paginated)
- **GET** `/daily-summary/employee/code/{employeeCode}?startDate=yyyy-MM-dd&endDate=yyyy-MM-dd&page=0&size=10` - Get summary by employee code and date range (paginated)

## Entity Models

### Employee
- employeeId (Long) - Primary Key
- empCode (String) - Unique employee code
- name (String) - Employee name
- email (String) - Employee email
- department (String) - Employee department

### AttendanceLog
- attendanceId (Long) - Primary Key
- employeeCode (String) - Foreign Key
- date (LocalDate) - Attendance date
- checkInTime (LocalTime) - Check-in time
- checkOutTime (LocalTime) - Check-out time
- location (String) - Work location

### AttendanceRecord
- attendanceRecordId (Long) - Primary Key
- employeeCode (String) - Foreign Key
- date (LocalDate) - Attendance date
- status (AttendanceLogStatus) - Attendance status enum

### AttendanceLogStatus (Enum)
- PRESENT
- ABSENT
- LATE
- EARLY_DEPARTURE

### DailyAttendanceSummary
- summaryId (Long) - Primary Key
- employeeCode (String) - Employee code
- date (LocalDate) - Summary date
- status (String) - Summary status

### AdminUser
- id (Long) - Primary Key
- username (String) - Admin username
- password (String) - Admin password