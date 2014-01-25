package clojure;

import clojure.lang.*;

public final class core_build_positional_factory_iter__5860__5864_fn__5865 extends clojure.lang.AFunction {
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
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "chunk-buffer");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "chunk-cons");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "chunk");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__12 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "nth");
  const__13 = (clojure.lang.Symbol)Symbol.intern(null, "overage");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object iter__58600;
 Object s__58611;
 public core_build_positional_factory_iter__5860__5864_fn__5865(final Object iter__58600, final Object s__58611) {
  super();
  this.iter__58600 = iter__58600;
  this.s__58611 = s__58611;
 }
 public java.lang.Object invoke() {
  {
   Object s__58611 = this.s__58611;
   while(true) {
    {
     Object temp__4117__auto__2 = ((IFn)const__0.getRawRoot()).invoke(s__58611);
     Object __r3726 = temp__4117__auto__2;
     if (__r3726 != null && !(__r3726 == Boolean.FALSE)) {
      {
       Object s__58613 = temp__4117__auto__2;
       Object __r3728 = ((IFn)const__1.getRawRoot()).invoke(s__58613);
       if (__r3728 != null && !(__r3728 == Boolean.FALSE)) {
        {
         Object c__4616__auto__4 = ((IFn)const__2.getRawRoot()).invoke(s__58613);
         int size__4617__auto__5 = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4616__auto__4)));
         Object b__58636 = ((IFn)const__5.getRawRoot()).invoke(Integer.valueOf(size__4617__auto__5));
         Object __r3730 = ((IFn)new clojure.core_build_positional_factory_iter__5860__5864_fn__5865_fn__5866(c__4616__auto__4, size__4617__auto__5, b__58636)).invoke();
         if (__r3730 != null && !(__r3730 == Boolean.FALSE)) {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__58636), ((IFn)this.iter__58600).invoke(((IFn)const__8.getRawRoot()).invoke(s__58613)));
         } else {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__58636), null);
         }
        }
       } else {
        {
         Object i7 = ((IFn)const__9.getRawRoot()).invoke(s__58613);
         return ((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(const__12, const__13, i7), ((IFn)this.iter__58600).invoke(((IFn)const__14.getRawRoot()).invoke(s__58613)));
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
