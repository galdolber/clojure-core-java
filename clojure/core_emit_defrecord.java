package clojure;

import clojure.lang.*;

public final class core_emit_defrecord extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Symbol const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.IPersistentSet const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Var const__23;
 public static final java.lang.Object const__24;
 public static final java.lang.Object const__25;
 public static final clojure.lang.Var const__26;
 public static final clojure.lang.Var const__27;
 public static final clojure.lang.Var const__28;
 public static final clojure.lang.Symbol const__29;
 public static final clojure.lang.Symbol const__30;
 public static final clojure.lang.Symbol const__31;
 public static final clojure.lang.Keyword const__32;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "namespace-munge");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "set");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "resolve");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__12 = (clojure.lang.Symbol)Symbol.intern(null, "__meta");
  const__13 = (clojure.lang.Symbol)Symbol.intern(null, "__extmap");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "hash");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "some");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "unsynchronized-mutable");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "volatile-mutable");
  const__18 = (clojure.lang.IPersistentSet)PersistentHashSet.create(Keyword.intern(null, "unsynchronized-mutable"), Keyword.intern(null, "volatile-mutable"));
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "mapcat");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "comp");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "keys");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "gensym");
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__24 = (java.lang.Object)0L;
  const__25 = (java.lang.Object)1L;
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__28 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__29 = (clojure.lang.Symbol)Symbol.intern(null, "deftype*");
  const__30 = (clojure.lang.Symbol)Symbol.intern(null, "__meta");
  const__31 = (clojure.lang.Symbol)Symbol.intern(null, "__extmap");
  const__32 = (clojure.lang.Keyword)Keyword.intern(null, "implements");
 }
 public core_emit_defrecord() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object tagname1, java.lang.Object name2, java.lang.Object fields3, java.lang.Object interfaces4, java.lang.Object methods5) {
  {
   Object classname6 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4.get()), ".", name2)), ((IFn)const__5.getRawRoot()).invoke(name2));
   Object interfaces7 = ((IFn)const__6.getRawRoot()).invoke(interfaces4);
   Object interface_set8 = ((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__9.getRawRoot(), interfaces7));
   Object methodname_set9 = ((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__10.getRawRoot(), methods5));
   Object hinted_fields10 = fields3;
   Object fields11 = ((IFn)const__6.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(new clojure.core_emit_defrecord_fn__5821(), fields3));
   Object base_fields12 = fields11;
   Object fields13 = ((IFn)const__11.getRawRoot()).invoke(fields11, const__12, const__13);
   Object type_hash14 = ((IFn)const__14.getRawRoot()).invoke(classname6);
   Object __r3722 = ((IFn)const__15.getRawRoot()).invoke(const__18, ((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__21.getRawRoot(), const__5.getRawRoot()), hinted_fields10));
   if (__r3722 != null && !(__r3722 == Boolean.FALSE)) {
    Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)":volatile-mutable or :unsynchronized-mutable not supported for record fields")));
   } else {
   }
   {
    Object gs15 = ((IFn)const__22.getRawRoot()).invoke();
    IFn irecord16 = new clojure.core_emit_defrecord_irecord__5824();
    IFn eqhash17 = new clojure.core_emit_defrecord_eqhash__5828(type_hash14, gs15);
    IFn iobj18 = new clojure.core_emit_defrecord_iobj__5832(tagname1, fields13, gs15);
    IFn ilookup19 = new clojure.core_emit_defrecord_ilookup__5836(tagname1, base_fields12);
    IFn imap20 = new clojure.core_emit_defrecord_imap__5844(tagname1, base_fields12, fields13, gs15, classname6);
    IFn ijavamap21 = new clojure.core_emit_defrecord_ijavamap__5854();
    {
     Object vec__585722 = ((IFn)ijavamap21).invoke(((IFn)imap20).invoke(((IFn)ilookup19).invoke(((IFn)iobj18).invoke(((IFn)eqhash17).invoke(((IFn)irecord16).invoke(RT.vector(interfaces7, methods5)))))));
     Object i23 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__585722), (int)RT.intCast(0L), ((java.lang.Object)null)));
     Object m24 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__585722), (int)RT.intCast(1L), ((java.lang.Object)null)));
     return ((IFn)const__26.getRawRoot()).invoke(((IFn)const__27.getRawRoot()).invoke(((IFn)const__28.getRawRoot()).invoke(const__29), ((IFn)const__28.getRawRoot()).invoke(tagname1), ((IFn)const__28.getRawRoot()).invoke(classname6), ((IFn)const__28.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(hinted_fields10, const__30, const__31)), ((IFn)const__28.getRawRoot()).invoke(const__32), ((IFn)const__28.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(i23)), m24));
    }
   }
  }
 }
}
