class employee
{
    float salary = 40000;
}
class inheritance_programmer extends employee{
    int bonus = 10000;
    public static void main(final String[] args)
    {
        inheritance_programmer p = new inheritance_programmer();
        System.out.println("Programmer salary is: "+p.salary);
        System.out.println("Bonus of Programmer is: "+p.bonus);
    }
}