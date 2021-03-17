public class SimpleIronManFactory {

    public IronMan createIronMan(Enum ironManType) {
        IronMan ironMan = null;

        /**
        자주 변경되는 코드 그래서 분리 함
        **/
        if(ironManType.equals(IronManType.Battle)) {
            ironMan = new BattleIronMan();
        } else if(ironManType.equals(IronManType.Nano)) {
            ironMan = new NanoIronMan();
        }
        return ironMan;
    }

}