package com.suncode.moviecatalogue.model;


import java.util.List;

public class Movie {


    /**
     * page : 1
     * total_results : 10000
     * total_pages : 500
     * results : [{"popularity":958.516,"vote_count":940,"video":false,"poster_path":"/TnOeov4w0sTtV2gqICqIxVi74V.jpg","id":605116,"adult":false,"backdrop_path":"/qVygtf2vU15L2yKS4Ke44U4oMdD.jpg","original_language":"en","original_title":"Project Power","genre_ids":[28,80,878],"title":"Project Power","vote_average":6.7,"overview":"An ex-soldier, a teen and a cop collide in New Orleans as they hunt for the source behind a dangerous new pill that grants users temporary superpowers.","release_date":"2020-08-14"},{"popularity":854.483,"vote_count":100,"video":false,"poster_path":"/uOw5JD8IlD546feZ6oxbIjvN66P.jpg","id":718444,"adult":false,"backdrop_path":"/x4UkhIQuHIJyeeOTdcbZ3t3gBSa.jpg","original_language":"en","original_title":"Rogue","genre_ids":[28],"title":"Rogue","vote_average":6,"overview":"Battle-hardened O\u2019Hara leads a lively mercenary team of soldiers on a daring mission: rescue hostages from their captors in remote Africa. But as the mission goes awry and the team is stranded, O\u2019Hara\u2019s squad must face a bloody, brutal encounter with a gang of rebels.","release_date":"2020-08-20"},{"popularity":621.413,"vote_count":148,"video":false,"poster_path":"/A3z0KMLIEGL22mVrgaV7KDxKRmT.jpg","id":539885,"adult":false,"backdrop_path":"/ekkuqt9Q2ad1F7xq2ZONP0oq36P.jpg","original_language":"en","original_title":"Ava","genre_ids":[28,80,18,53],"title":"Ava","vote_average":6.3,"overview":"A black ops assassin is forced to fight for her own survival after a job goes dangerously wrong.","release_date":"2020-08-06"},{"popularity":598.192,"vote_count":93,"video":false,"poster_path":"/6Bbq8qQWpoApLZYWFFAuZ1r2gFw.jpg","id":618354,"adult":false,"backdrop_path":"/bazlsLkNuhy3IuhviepqvlMm2hV.jpg","original_language":"en","original_title":"Superman: Man of Tomorrow","genre_ids":[28,16,878],"title":"Superman: Man of Tomorrow","vote_average":7.5,"overview":"It\u2019s the dawn of a new age of heroes, and Metropolis has just met its first. But as Daily Planet intern Clark Kent \u2013 working alongside reporter Lois Lane \u2013 secretly wields his alien powers of flight, super-strength and x-ray vision in the battle for good, there\u2019s even greater trouble on the horizon.","release_date":"2020-08-23"},{"popularity":378.099,"vote_count":646,"video":false,"poster_path":"/k68nPLbIST6NP96JmTxmZijEvCA.jpg","id":577922,"adult":false,"backdrop_path":"/wzJRB4MKi3yK138bJyuL9nx47y6.jpg","original_language":"en","original_title":"Tenet","genre_ids":[28,878,53],"title":"Tenet","vote_average":7.6,"overview":"Armed with only one word - Tenet - and fighting for the survival of the entire world, the Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.","release_date":"2020-08-22"},{"popularity":371.351,"vote_count":53,"video":false,"poster_path":"/i4kPwXPlM1iy8Jf3S1uuLuwqQAV.jpg","id":721452,"adult":false,"backdrop_path":"/riDrpqQtZpXGeiJdlmfcwwPH7nN.jpg","original_language":"en","original_title":"One Night in Bangkok","genre_ids":[28,53],"title":"One Night in Bangkok","vote_average":7.1,"overview":"A hit man named Kai flies into Bangkok, gets a gun, and orders a cab. He offers a professional female driver big money to be his all-night driver. But when she realizes Kai is committing brutal murders at each stop, it's too late to walk away. Meanwhile, an offbeat police detective races to decode the string of slayings before more blood is spilled.","release_date":"2020-08-25"},{"popularity":342.034,"vote_count":50,"video":false,"poster_path":"/5pe30v0z4ucVgwh5nR439cCzwwO.jpg","id":632618,"adult":false,"backdrop_path":"/cVdYaAQmd5DZNdo0KFJruz7JpUs.jpg","original_language":"es","original_title":"Crímenes de familia","genre_ids":[80,18,53],"title":"The Crimes That Bind","vote_average":7.1,"overview":"When her son is accused of raping and trying to murder his ex-wife, Alicia embarks on a journey that will change her life forever.","release_date":"2020-08-20"},{"popularity":323.965,"vote_count":1865,"video":false,"poster_path":"/cjr4NWURcVN3gW5FlHeabgBHLrY.jpg","id":547016,"adult":false,"backdrop_path":"/m0ObOaJBerZ3Unc74l471ar8Iiy.jpg","original_language":"en","original_title":"The Old Guard","genre_ids":[28,14],"title":"The Old Guard","vote_average":7.3,"overview":"Four undying warriors who've secretly protected humanity for centuries become targeted for their mysterious powers just as they discover a new immortal.","release_date":"2020-07-10"},{"popularity":251.91,"vote_count":232,"video":false,"poster_path":"/sy6DvAu72kjoseZEjocnm2ZZ09i.jpg","id":581392,"adult":false,"backdrop_path":"/gEjNlhZhyHeto6Fy5wWy5Uk3A9D.jpg","original_language":"ko","original_title":"반도","genre_ids":[28,27,53],"title":"Peninsula","vote_average":7.4,"overview":"A soldier and his team battle hordes of post-apocalyptic zombies in the wastelands of the Korean Peninsula.","release_date":"2020-07-15"},{"popularity":310.489,"vote_count":512,"video":false,"poster_path":"/jHo2M1OiH9Re33jYtUQdfzPeUkx.jpg","id":385103,"adult":false,"backdrop_path":"/fKtYXUhX5fxMxzQfyUcQW9Shik6.jpg","original_language":"en","original_title":"Scoob!","genre_ids":[12,16,35,10751],"title":"Scoob!","vote_average":7.4,"overview":"In Scooby-Doo\u2019s greatest adventure yet, see the never-before told story of how lifelong friends Scooby and Shaggy first met and how they joined forces with young detectives Fred, Velma, and Daphne to form the famous Mystery Inc. Now, with hundreds of cases solved, Scooby and the gang face their biggest, toughest mystery ever: an evil plot to unleash the ghost dog Cerberus upon the world. As they race to stop this global \u201cdogpocalypse,\u201d the gang discovers that Scooby has a secret legacy and an epic destiny greater than anyone ever imagined.","release_date":"2020-07-08"},{"popularity":253.302,"vote_count":243,"video":false,"poster_path":"/q1MNlZYqhoD4U7sd7pjxD6SUf4z.jpg","id":621013,"adult":false,"backdrop_path":"/1eq896TCOEeN9Q8iTJL0n9u31Qf.jpg","original_language":"en","original_title":"Chemical Hearts","genre_ids":[18,10749],"title":"Chemical Hearts","vote_average":8,"overview":"A high school transfer student finds a new passion when she begins to work on the school's newspaper.","release_date":"2020-08-21"},{"popularity":259.507,"vote_count":1033,"video":false,"poster_path":"/kjMbDciooTbJPofVXgAoFjfX8Of.jpg","id":516486,"adult":false,"backdrop_path":"/xXBnM6uSTk6qqCf0SRZKXcga9Ba.jpg","original_language":"en","original_title":"Greyhound","genre_ids":[28,18,10752],"title":"Greyhound","vote_average":7.5,"overview":"A first-time captain leads a convoy of allied ships carrying thousands of soldiers across the treacherous waters of the \u201cBlack Pit\u201d to the front lines of WW2. With no air cover protection for 5 days, the captain and his convoy must battle the surrounding enemy Nazi U-boats in order to give the allies a chance to win the war.","release_date":"2020-06-19"},{"popularity":283.234,"vote_count":121,"video":false,"poster_path":"/vFIHbiy55smzi50RmF8LQjmpGcx.jpg","id":703771,"adult":false,"backdrop_path":"/owraiceOKtSOa3t8sp3wA9K2Ox6.jpg","original_language":"en","original_title":"Deathstroke: Knights & Dragons - The Movie","genre_ids":[28,16],"title":"Deathstroke: Knights & Dragons - The Movie","vote_average":6.9,"overview":"Ten years ago, Slade Wilson-aka the super-assassin called Deathstroke-made a tragic mistake and his wife and son paid a terrible price. Now, a decade later, Wilson's family is threatened once again by the murderous Jackal and the terrorists of H.IV.E. Can Deathstroke atone for the sins of the past-or will his family pay the ultimate price?","release_date":"2020-08-04"},{"popularity":222.892,"vote_count":98,"video":false,"poster_path":"/9iEc34Qje2V3FZnrSXKfZsbiHjW.jpg","id":626393,"adult":false,"backdrop_path":"/mQngZ4DtXqdkX9fOQRsm9iym5OW.jpg","original_language":"en","original_title":"The Sleepover","genre_ids":[28,10751],"title":"The Sleepover","vote_average":6.7,"overview":"Two siblings who discover their seemingly normal mom is a former thief in witness protection. Mom is forced to pull one last job, and the kids team up to rescue her over the course of an action-packed night.","release_date":"2020-08-21"},{"popularity":224.484,"vote_count":5590,"video":false,"poster_path":"/h4VB6m0RwcicVEZvzftYZyKXs6K.jpg","id":495764,"adult":false,"backdrop_path":"/9xNOiv6DZZjH7ABoUUDP0ZynouU.jpg","original_language":"en","original_title":"Birds of Prey (and the Fantabulous Emancipation of One Harley Quinn)","genre_ids":[28,35,80],"title":"Birds of Prey (and the Fantabulous Emancipation of One Harley Quinn)","vote_average":7.2,"overview":"Harley Quinn joins forces with a singer, an assassin and a police detective to help a young girl who had a hit placed on her after she stole a rare diamond from a crime lord.","release_date":"2020-02-05"},{"popularity":195.485,"vote_count":5506,"video":false,"poster_path":"/aQvJ5WPzZgYVDrxLX4R6cLJCEaQ.jpg","id":454626,"adult":false,"backdrop_path":"/stmYfCUGd8Iy6kAMBr6AmWqx8Bq.jpg","original_language":"en","original_title":"Sonic the Hedgehog","genre_ids":[28,35,878,10751],"title":"Sonic the Hedgehog","vote_average":7.5,"overview":"Based on the global blockbuster videogame franchise from Sega, Sonic the Hedgehog tells the story of the world\u2019s speediest hedgehog as he embraces his new home on Earth. In this live-action adventure comedy, Sonic and his new best friend team up to defend the planet from the evil genius Dr. Robotnik and his plans for world domination.","release_date":"2020-02-12"},{"popularity":205.191,"vote_count":19486,"video":false,"poster_path":"/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg","id":299536,"adult":false,"backdrop_path":"/bOGkgRGdhrBYJSLpXaxhXVstddV.jpg","original_language":"en","original_title":"Avengers: Infinity War","genre_ids":[28,12,878],"title":"Avengers: Infinity War","vote_average":8.3,"overview":"As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.","release_date":"2018-04-25"},{"popularity":192.812,"vote_count":5031,"video":false,"poster_path":"/y95lQLnuNKdPAzw9F9Ab8kJ80c3.jpg","id":38700,"adult":false,"backdrop_path":"/upUy2QhMZEmtypPW3PdieKLAHxh.jpg","original_language":"en","original_title":"Bad Boys for Life","genre_ids":[28,80,53],"title":"Bad Boys for Life","vote_average":7.3,"overview":"Marcus and Mike are forced to confront new threats, career changes, and midlife crises as they join the newly created elite team AMMO of the Miami police department to take down the ruthless Armando Armas, the vicious leader of a Miami drug cartel.","release_date":"2020-01-15"},{"popularity":229.816,"vote_count":107,"video":false,"poster_path":"/3eg0kGC2Xh0vhydJHO37Sp4cmMt.jpg","id":531499,"adult":false,"backdrop_path":"/zogWnCSztU8xvabaepQnAwsOtOt.jpg","original_language":"en","original_title":"The Tax Collector","genre_ids":[28,80,18],"title":"The Tax Collector","vote_average":6,"overview":"David Cuevas is a family man who works as a gangland tax collector for high ranking Los Angeles gang members. He makes collections across the city with his partner Creeper making sure people pay up or will see retaliation. An old threat returns to Los Angeles that puts everything David loves in harm\u2019s way.","release_date":"2020-08-07"},{"popularity":189.783,"vote_count":14524,"video":false,"poster_path":"/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg","id":475557,"adult":false,"backdrop_path":"/n6bUvigpRFqSwmPp1m2YADdbRBc.jpg","original_language":"en","original_title":"Joker","genre_ids":[80,18,53],"title":"Joker","vote_average":8.2,"overview":"During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure.","release_date":"2019-10-02"}]
     */

    private int page;
    private int total_results;
    private int total_pages;
    private List<ResultsBean> results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {

        private double popularity;
        private int vote_count;
        private boolean video;
        private String poster_path;
        private int id;
        private boolean adult;
        private String backdrop_path;
        private String original_language;
        private String original_title;
        private String title;
        private double vote_average;
        private String overview;
        private String release_date;
        private List<Integer> genre_ids;

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public int getVote_count() {
            return vote_count;
        }

        public void setVote_count(int vote_count) {
            this.vote_count = vote_count;
        }

        public boolean isVideo() {
            return video;
        }

        public void setVideo(boolean video) {
            this.video = video;
        }

        public String getPoster_path() {
            return poster_path;
        }

        public void setPoster_path(String poster_path) {
            this.poster_path = poster_path;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public boolean isAdult() {
            return adult;
        }

        public void setAdult(boolean adult) {
            this.adult = adult;
        }

        public String getBackdrop_path() {
            return backdrop_path;
        }

        public void setBackdrop_path(String backdrop_path) {
            this.backdrop_path = backdrop_path;
        }

        public String getOriginal_language() {
            return original_language;
        }

        public void setOriginal_language(String original_language) {
            this.original_language = original_language;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getVote_average() {
            return vote_average;
        }

        public void setVote_average(double vote_average) {
            this.vote_average = vote_average;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getRelease_date() {
            return release_date;
        }

        public void setRelease_date(String release_date) {
            this.release_date = release_date;
        }

        public List<Integer> getGenre_ids() {
            return genre_ids;
        }

        public void setGenre_ids(List<Integer> genre_ids) {
            this.genre_ids = genre_ids;
        }
    }
}