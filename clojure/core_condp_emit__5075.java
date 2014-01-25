package clojure;

import clojure.lang.*;

public final class core_condp_emit__5075 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final java.lang.Object const__7;
 public static final java.lang.Object const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Symbol const__14;
 public static final clojure.lang.Symbol const__15;
 public static final clojure.lang.Symbol const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Symbol const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Symbol const__21;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "split-at");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, ">>");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__4 = (java.lang.Object)3L;
  const__5 = (java.lang.Object)2L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__7 = (java.lang.Object)0L;
  const__8 = (java.lang.Object)1L;
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__13 = (clojure.lang.Symbol)Symbol.intern(null, "throw");
  const__14 = (clojure.lang.Symbol)Symbol.intern(null, "java.lang.IllegalArgumentException.");
  const__15 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "str");
  const__16 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__18 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "if-let");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__21 = (clojure.lang.Symbol)Symbol.intern(null, "p__5074__auto__");
 }
 public core_condp_emit__5075() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object pred1, java.lang.Object expr2, java.lang.Object args3) {
  {
   Object __r3248;
   if (clojure.lang.Util.equiv(((java.lang.Object)const__2), ((java.lang.Object)((IFn)const__3.getRawRoot()).invoke(args3)))) {
    __r3248 = const__4;
   } else {
    __r3248 = const__5;
   }
   Object vec__50764 = ((IFn)const__0.getRawRoot()).invoke((java.lang.Long)__r3248, args3);
   Object vec__50775 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__50764), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object a6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__50775), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object b7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__50775), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object c8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__50775), (int)RT.intCast(2L), ((java.lang.Object)null)));
   Object clause9 = vec__50775;
   Object more10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__50764), (int)RT.intCast(1L), ((java.lang.Object)null)));
   int n11 = clojure.lang.RT.count(((java.lang.Object)clause9));
   if (clojure.lang.Util.equiv((long)0L, (long)n11)) {
    return ((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__13), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__14), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__15), ((IFn)const__12.getRawRoot()).invoke("No matching clause: "), ((IFn)const__12.getRawRoot()).invoke(expr2)))))))));
   } else {
    if (clojure.lang.Util.equiv((long)1L, (long)n11)) {
     return a6;
    } else {
     if (clojure.lang.Util.equiv((long)2L, (long)n11)) {
      return ((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__16), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(pred1), ((IFn)const__12.getRawRoot()).invoke(a6), ((IFn)const__12.getRawRoot()).invoke(expr2)))), ((IFn)const__12.getRawRoot()).invoke(b7), ((IFn)const__12.getRawRoot()).invoke(((IFn)this).invoke(pred1, expr2, more10))));
     } else {
      Object __r3253 = const__17;
      if (__r3253 != null && !(__r3253 == Boolean.FALSE)) {
       return ((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__18), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(const__20.getRawRoot(), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__21), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(pred1), ((IFn)const__12.getRawRoot()).invoke(a6), ((IFn)const__12.getRawRoot()).invoke(expr2)))))))), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(c8), ((IFn)const__12.getRawRoot()).invoke(const__21)))), ((IFn)const__12.getRawRoot()).invoke(((IFn)this).invoke(pred1, expr2, more10))));
      } else {
       return null;
      }
     }
    }
   }
  }
 }
}
