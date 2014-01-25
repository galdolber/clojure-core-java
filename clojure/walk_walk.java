package clojure;

import clojure.lang.*;

public final class walk_walk extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Keyword const__12;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "list?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__5 = (java.lang.Object)clojure.lang.IMapEntry.class;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "doall");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "coll?");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "into");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "empty");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "else");
 }
 public walk_walk() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object inner1, java.lang.Object outer2, java.lang.Object form3) {
  Object __r4344 = ((IFn)const__0.getRawRoot()).invoke(form3);
  if (__r4344 != null && !(__r4344 == Boolean.FALSE)) {
   return ((IFn)outer2).invoke(((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), ((IFn)const__3.getRawRoot()).invoke(inner1, form3)));
  } else {
   if ((form3 instanceof clojure.lang.IMapEntry)) {
    return ((IFn)outer2).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(inner1, form3)));
   } else {
    Object __r4347 = ((IFn)const__7.getRawRoot()).invoke(form3);
    if (__r4347 != null && !(__r4347 == Boolean.FALSE)) {
     return ((IFn)outer2).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(inner1, form3)));
    } else {
     Object __r4349 = ((IFn)const__9.getRawRoot()).invoke(form3);
     if (__r4349 != null && !(__r4349 == Boolean.FALSE)) {
      return ((IFn)outer2).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(form3), ((IFn)const__3.getRawRoot()).invoke(inner1, form3)));
     } else {
      Object __r4351 = const__12;
      if (__r4351 != null && !(__r4351 == Boolean.FALSE)) {
       return ((IFn)outer2).invoke(form3);
      } else {
       return null;
      }
     }
    }
   }
  }
 }
}
