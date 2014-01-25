package clojure;

import clojure.lang.*;

public final class core_generate_proxy_iter__5244__5250_fn__5251_iter__5246__5252_fn__5253_fn__5254 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "method-sig");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "chunk-append");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
 }
 Object considered50;
 Object c__4616__auto__4;
 Object b__52496;
 int size__4617__auto__5;
 public core_generate_proxy_iter__5244__5250_fn__5251_iter__5246__5252_fn__5253_fn__5254(final Object considered50, final Object c__4616__auto__4, final Object b__52496, final int size__4617__auto__5) {
  super();
  this.considered50 = considered50;
  this.c__4616__auto__4 = c__4616__auto__4;
  this.b__52496 = b__52496;
  this.size__4617__auto__5 = size__4617__auto__5;
 }
 public java.lang.Object invoke() {
  {
   long i__52481 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
   while(true) {
    if (clojure.lang.Numbers.lt((long)i__52481, (long)size__4617__auto__5)) {
     {
      Object meth2 = ((java.lang.Object)((clojure.lang.Indexed)this.c__4616__auto__4).nth((int)RT.intCast(i__52481)));
      {
       Object msig3 = ((IFn)const__3.getRawRoot()).invoke(meth2);
       Object __r3343 = ((IFn)const__4.getRawRoot()).invoke(((IFn)this.considered50).invoke(msig3));
       if (__r3343 != null && !(__r3343 == Boolean.FALSE)) {
        ((IFn)const__5.getRawRoot()).invoke(this.b__52496, RT.mapUniqueKeys(msig3, meth2));
        long i__52481___aux = clojure.lang.Numbers.unchecked_inc((long)i__52481);
        i__52481 = i__52481___aux;
        continue;
       } else {
        long i__52481___aux = clojure.lang.Numbers.unchecked_inc((long)i__52481);
        i__52481 = i__52481___aux;
        continue;
       }
      }
     }
    } else {
     return Boolean.TRUE;
    }
   }
  }
 }
}
