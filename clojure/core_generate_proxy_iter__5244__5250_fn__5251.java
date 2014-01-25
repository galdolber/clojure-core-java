package clojure;

import clojure.lang.*;

public final class core_generate_proxy_iter__5244__5250_fn__5251 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object s__52451;
 Object iter__52440;
 Object considered50;
 public core_generate_proxy_iter__5244__5250_fn__5251(final Object s__52451, final Object iter__52440, final Object considered50) {
  super();
  this.s__52451 = s__52451;
  this.iter__52440 = iter__52440;
  this.considered50 = considered50;
 }
 public java.lang.Object invoke() {
  {
   Object s__52451 = this.s__52451;
   while(true) {
    {
     Object temp__4117__auto__2 = ((IFn)const__0.getRawRoot()).invoke(s__52451);
     Object __r3353 = temp__4117__auto__2;
     if (__r3353 != null && !(__r3353 == Boolean.FALSE)) {
      {
       Object xs__4607__auto__3 = temp__4117__auto__2;
       {
        Object iface4 = ((IFn)const__1.getRawRoot()).invoke(xs__4607__auto__3);
        {
         Object iterys__4614__auto__5 = new clojure.core_generate_proxy_iter__5244__5250_fn__5251_iter__5246__5252(this.considered50);
         Object fs__4615__auto__6 = ((IFn)const__0.getRawRoot()).invoke(((IFn)iterys__4614__auto__5).invoke(((java.lang.reflect.Method[])((java.lang.Class)iface4).getMethods())));
         Object __r3355 = fs__4615__auto__6;
         if (__r3355 != null && !(__r3355 == Boolean.FALSE)) {
          return ((IFn)const__2.getRawRoot()).invoke(fs__4615__auto__6, ((IFn)this.iter__52440).invoke(((IFn)const__3.getRawRoot()).invoke(s__52451)));
         } else {
          java.lang.Object s__52451___aux = ((IFn)const__3.getRawRoot()).invoke(s__52451);
          s__52451 = s__52451___aux;
          continue;
         }
        }
       }
      }
     } else {
      return null;
     }
    }
   }
  }
 }
}
