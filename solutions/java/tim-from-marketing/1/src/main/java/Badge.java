class Badge {
    public String print(Integer id, String name, String department) {
        if (department == null) {
            if (id == null) {
                return name + " - OWNER";
            }

            return "[" + id + "]" + " - " + name + " - OWNER";
        }
        
        if (id == null) {
            return name + " - " + department.toUpperCase();
        }

        return "[" + id + "]" + " - " + name + " - " + department.toUpperCase();
    }
}
